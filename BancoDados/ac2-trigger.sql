use BANCO_AC2
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
	SELECT @anoNascimento = YEAR(DataNascimento) FROM inserted

	if @hoje - @anoNascimento < 18
	begin
		raiserror('Cadastro somente após ter a idade maior que 18 anos', 10, 1)
		rollback
	end
END

-- Validação
INSERT INTO Personagem values ('Goku3.0', 'Goku boladaço sqn', '05-06-2003', 2, 1, 0)
INSERT INTO Personagem values ('Amendoa', 'Um novo personagem ai', '22-03-2010', 3, 2, 45)

select * from Personagem

-- Exercicio 3
CREATE OR ALTER TRIGGER tgrLogInsertPersonagem
ON Personagem
AFTER INSERT
AS
BEGIN
    declare @NomePersonagem varchar(100), @nomeRaca varchar(100), @nomeClasse varchar(100), @nomeHabilidade varchar(100), @detalhes varchar(1000)
	declare @raca int, @classe int, @habilidade int
	SELECT @NomePersonagem = Nome, @raca = IDRaca, @classe = IDClasse FROM inserted
	SELECT @nomeRaca = Nome FROM Raca WHERE IDRaca = @raca
	SELECT @nomeClasse = Nome FROM Classe WHERE IDClasse = @classe
	SELECT @nomeHabilidade = Nome FROM Habilidade WHERE IDHabilidade = @habilidade
    SET @detalhes = CONCAT('Personagem: ', @NomePersonagem, ' - Raca: ', @nomeRaca, ' - Classe: ', @nomeClasse, ' - Habilidade: ', @nomeHabilidade)

	INSERT INTO LogFull (Tabela, Operacao, Detalhes, DataEvento) VALUES
('Personagem', 'Inserindo Personagem', @detalhes, getdate())
END


--Validação 
SELECT * FROM LogFull
SELECT * FROM Personagem
SELECT * FROM Raca
SELECT * FROM Habilidade
INSERT INTO Personagem values ('Goku2.0', 'O novo Goku', '01-01-2000', 1, 3, 75)

-- Exercicio 4
CREATE OR ALTER TRIGGER tgrLogInsertValidarPersonagem
ON Personagem
AFTER INSERT
AS
BEGIN
    declare @hoje int, @anoNascimento datetime
	declare @NomePersonagem varchar(100), @nomeRaca varchar(100), @nomeClasse varchar(100), @nomeHabilidade varchar(100), @detalhes varchar(1000)
	declare @raca int, @classe int, @habilidade int
	set @hoje = YEAR(GETDATE())
	SELECT @anoNascimento = YEAR(DataNascimento) FROM inserted
	SELECT @NomePersonagem = Nome, @raca = IDRaca, @classe = IDClasse FROM inserted
	SELECT @nomeRaca = Nome FROM Raca WHERE IDRaca = @raca
	SELECT @nomeClasse = Nome FROM Classe WHERE IDClasse = @classe
	SELECT @nomeHabilidade = Nome FROM Habilidade WHERE IDHabilidade = @habilidade
	SET @detalhes = CONCAT('Personagem: ', @NomePersonagem, ' - Raca: ', @nomeRaca, ' - Classe: ', @nomeClasse, ' - Habilidade: ', @nomeHabilidade)

	if @hoje - @anoNascimento < 18
	begin
		raiserror('Cadastro somente após ter a idade maior que 18 anos', 10, 1)
		rollback
	end    

	INSERT INTO LogFull (Tabela, Operacao, Detalhes, DataEvento) VALUES
('Personagem', 'Inserindo Personagem', @detalhes, getdate())

END

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

UPDATE Raca SET Nome = 'Orc2.0' WHERE Nome = 'Orc'
SELECT * FROM LogFull WHERE Tabela = 'Raca';

-- Exercicio 6
CREATE OR ALTER TRIGGER tgrLogDeleteHabilidade
ON Habilidade
AFTER DELETE
AS
BEGIN  
	declare @nomeHabilidade varchar(100), @detalhes varchar(1000)
	declare @IDhabilidade int, @poder int
	SELECT @nomeHabilidade = Nome, @IDhabilidade = IDHabilidade, @poder = MultiplicadorPoder FROM deleted
    SET @detalhes = CONCAT('ID: ', @IDhabilidade, ' - Nome: ', @nomeHabilidade, ' - Poder: ', @poder)

    INSERT INTO LogFull (Tabela, Operacao, Detalhes, DataEvento) VALUES
('Habilidade', 'Excluindo Habilidade', @detalhes, getdate())
END

-- Validação
SELECT * FROM Habilidade
SELECT * FROM LogFull
INSERT INTO Habilidade(Nome, MultiplicadorPoder) VALUES ('Nova Habilidade', 350)
DELETE FROM Habilidade WHERE MultiplicadorPoder = '350'
