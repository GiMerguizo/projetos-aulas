-- AC1 - Parte 2
use BANCO_AC1

-- Exercício 1
SELECT COUNT(IDHabilidade) QtdHabilidades FROM Habilidade

-- Exercício 2
SELECT
	a.Nome NomeClasse,
	COUNT(b.IDClasse) QtdPersonagem
FROM 
	Classe a right join Personagem b
		ON a.IDClasse = b.IDClasse
GROUP BY a.Nome

-- Exercício 3
SELECT
	a.Nome NomeRaca,
	COUNT(b.IDRaca) QtdRaca
FROM
	Raca a left join Personagem b
		ON a.IDRaca = b.IDRaca
GROUP BY a.Nome

-- Exercício 4
SELECT
	a.Nome NomeClasse,
	AVG(b.Poder) MediaPoder,
	SUM(b.Poder) SomaPoder
FROM
	Classe a left join Personagem b
		ON a.IDClasse = b.IDClasse
GROUP BY a.Nome
HAVING AVG(b.Poder) >= 100

-- Exercício 5

SELECT * FROM Personagem
SELECT * FROM Classe
SELECT * FROM Raca
SELECT * FROM Habilidade

SELECT 
	a.Nome NomePersonagem,
	a.DataNascimento DataNascimento,
	b.Nome NomeRaca,
	c.Nome NomeClasse,
	d.Nome NomeHabilidade
FROM
	Personagem a left join Raca b 
		ON a.IDRaca = b.IDRaca
	left join Classe c 
		ON a.IDClasse = c.IDClasse
	left join Habilidade d
		ON c.IDHabilidade = d.IDHabilidade

