-- AC2

-- Exercicio 1
CREATE or ALTER PROCEDURE spBuscaPersonagem @NomePersonagem varchar(50)
AS
BEGIN
SELECT
	A.Nome NomePersonagem,
	YEAR(A.DataNascimento) AnoNascimento,
	B.Nome NomeRaca,
	C.Nome NomeClasse,
	D.Nome NomeHabilidade
FROM
	Personagem A LEFT JOIN Raca B
	ON A.IDRaca = B.IDRaca
	LEFT JOIN Classe C
	ON A.IDClasse = C.IDClasse
	LEFT JOIN Habilidade D
	ON C.IDHabilidade = D.IDHabilidade
WHERE
	A.Nome = @NomePersonagem
END
GO

exec spBuscaPersonagem 'Gohan' --Por posição

-- Exercicio 2
CREATE OR ALTER PROCEDURE spQtdPersonagemAno
	@AnoInicio int,
	@AnoFim int,
	@QuantidadePersonagem int
OUTPUT
AS
BEGIN
	SELECT @QuantidadePersonagem = COUNT(*)
	FROM Personagem
	WHERE YEAR(DataNascimento)
	between @AnoInicio and @AnoFim
END
GO

DECLARE @TotalPersonagem INT
EXEC spQtdPersonagemAno @AnoInicio = 1999, @AnoFim = 2023, @QuantidadePersonagem = @TotalPersonagem OUTPUT 
PRINT @TotalPersonagem
SELECT cast(@TotalPersonagem as varchar) AS QuantidadePersonagens

-- Exercicio 3
CREATE OR ALTER PROCEDURE spAtualizaMultiplicadorPoder @IDHabilidade int, @Valor int
AS
BEGIN
	DECLARE @NovoValor int
	BEGIN TRY
		BEGIN TRAN MyTransaction
			UPDATE Habilidade SET MultiplicadorPoder = MultiplicadorPoder + @Valor WHERE IDHabilidade = @IDHabilidade
			SET @NovoValor = (SELECT MultiplicadorPoder FROM Habilidade WHERE IDHabilidade = @IDHabilidade)
			PRINT 'Novo valor: ' + cast(@NovoValor as varchar)
			IF @NovoValor > 0 and @NovoValor < 100
			BEGIN
				COMMIT
				PRINT 'commit'
			END
			ELSE
			BEGIN
				ROLLBACK
				PRINT 'rollback'
			END
	END TRY
	BEGIN CATCH
		PRINT 'Algo deu errado!'
	END CATCH
END
GO

exec spAtualizaMultiplicadorPoder @IDHabilidade = 3, @Valor = -200
exec spAtualizaMultiplicadorPoder @IDHabilidade = 3, @Valor = 50

-- Exercicio 4
CREATE OR ALTER FUNCTION fnQuantidadePersonagensPorClasse
(@IDClasse INT)
RETURNS INT
AS
BEGIN
    DECLARE @Quantidade INT

    SELECT @Quantidade = COUNT(*)
    FROM Personagem
    WHERE IDClasse = @IDClasse

    RETURN @Quantidade
END
GO

SELECT dbo.fnQuantidadePersonagensPorClasse(1) AS 'Quantidade de Personagens associados'

-- Exercicio 5
CREATE OR ALTER FUNCTION fnInfoPersonagens
(@Opcao INT)
RETURNS @Resultado TABLE 
(
    Nome NVARCHAR(200),
    Quantidade INT
)
AS
BEGIN
    IF @Opcao = 1
    BEGIN
        INSERT INTO @Resultado
        SELECT 
            C.Nome AS 'Nome',
            COUNT(P.IDPersonagem) AS 'Quantidade'
        FROM Classe C
        LEFT JOIN Personagem P ON C.IDClasse = P.IDClasse
        GROUP BY C.Nome
    END
    ELSE IF @Opcao = 2
    BEGIN
        INSERT INTO @Resultado
        SELECT 
            R.Nome AS 'Nome',
            COUNT(P.IDPersonagem) AS 'Quantidade'
        FROM Raca R
        LEFT JOIN Personagem P ON R.IDRaca = P.IDRaca
        GROUP BY R.Nome
    END
    ELSE IF @Opcao = 3
    BEGIN
        INSERT INTO @Resultado
        SELECT 
            H.Nome AS 'Nome',
            COUNT(P.IDPersonagem) AS 'Quantidade'
        FROM Habilidade H
        JOIN Classe C ON H.IDHabilidade = C.IDHabilidade
        LEFT JOIN Personagem P ON C.IDClasse = P.IDClasse
        GROUP BY H.Nome
    END

    RETURN
END
GO

-- Seleções para a função
SELECT * FROM fnInfoPersonagens(1)
SELECT * FROM fnInfoPersonagens(2)
SELECT * FROM fnInfoPersonagens(3)