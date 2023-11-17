-- AC2 - Triggers

-- Exercicio 1
CREATE TABLE LogFull (
	IDLogFull int PRIMARY KEY identity not null,
	Tabela varchar(255) not null,
	Operacao varchar(255) not null,
	Detalhes varchar(1000) not null,
	DataEvento datetime not null
)

SELECT * FROM LogFull

-- Exercicio 2
CREATE OR ALTER TRIGGER tgrValidarPersonagem
ON Personagem
AFTER INSERT
AS
BEGIN
	declare @hoje int, @anoNascimento datetime
	set @hoje = YEAR(GETDATE())
	set @anoNascimento = (SELECT DataNascimento FROM Personagem)

	if @hoje - @anoNascimento > 18
	begin
		raiserror('Cadastro somente após ter a idade maior que 18 anos', 10, 1)
		rollback
	end
END

-- Validação
INSERT INTO Personagem values ('Amendoa', 'Um novo personagem ai', '05-06-2003', 2, 1, 0)

select * from Personagem

-- Exercicio 3
CREATE OR ALTER TRIGGER tgrLogInsertPersonagem
ON Personagem
AFTER INSERT
AS
BEGIN
INSERT INTO LogFull (Tabela, Operacao, Detalhes, DataEvento) VALUES
('Personagem', 'Inserindo Personagem', 'Teste', getdate())
END


--Validação 
SELECT * FROM LogFull
SELECT * FROM Personagem
INSERT INTO Personagem values ('Goku2.0', 'O novo Goku', '01-01-2000', 1, 3, 75)

-- Exercicio 5
CREATE OR ALTER TRIGGER tgrLogAlteracaoRaca
ON Raca
AFTER UPDATE
AS
BEGIN
    DECLARE @nomeAntigo nvarchar(100), @origemAntiga nvarchar(100)
    DECLARE @nomeAtual nvarchar(100), @origemAtual nvarchar(100), @detalhes nvarchar(400)

    -- Captura os valores antigos
    SELECT @nomeAntigo = Nome, @origemAntiga = Origem 
    FROM deleted

    -- Captura os valores atuais
    SELECT @nomeAtual = Nome, @origemAtual = Origem 
    FROM inserted

    -- Formata os detalhes para inserção no Log
    SET @detalhes = CONCAT('Nome mudou de ', @nomeAntigo, ' para ', @nomeAtual, 
                           ', Origem mudou de ', @origemAntiga, ' para ', @origemAtual)

    -- Insere no LogFull
    INSERT INTO LogFull (Tabela, Operacao, Detalhes, DataEvento) 
    VALUES ('Raca', 'Atualização', @detalhes, GETDATE())
END

-- Validação
SELECT * FROM Raca;

SELECT * FROM LogFull WHERE Tabela = 'Raca';
