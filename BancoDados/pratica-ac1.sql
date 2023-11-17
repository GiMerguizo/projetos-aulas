CREATE DATABASE BANCO_AC1
use BANCO_AC1

-- Exercicio 1
CREATE TABLE Raca (
    IDRaca int not null PRIMARY KEY identity,
	Nome varchar(100) not null,
	Descricao varchar(500),
	Origem varchar(100) not null,
	Perdido datetime
)

CREATE TABLE Habilidade (
	IDHabilidade int not null PRIMARY KEY identity,
	Nome varchar(200) not null,
	MultiplicadorPoder int
)

CREATE TABLE Classe (
	IDClasse int not null PRIMARY KEY identity,
	Nome varchar(100) not null,
	Caracteristicas varchar(1000),
	IDHabilidade int,
	CONSTRAINT FKIDHabilidade FOREIGN KEY (IDHabilidade) REFERENCES Habilidade(IDHabilidade)
)

CREATE TABLE Personagem (
	IDPersonagem int not null PRIMARY KEY identity,
	Nome varchar(100) not null,
	Descricao varchar(500),
	DataNascimento datetime not null,
	IDRaca int not null,
	IDClasse int not null,
	CONSTRAINT FKIDRaca FOREIGN KEY (IDRaca) REFERENCES Raca(IDRaca),
	CONSTRAINT FKIDClasse FOREIGN KEY (IDClasse) REFERENCES Classe(IDClasse)
)

-- Exercicio 2
SELECT * FROM Personagem

ALTER TABLE Personagem ADD Poder int

-- Exercicio 3
SELECT * FROM Classe

ALTER TABLE Classe ALTER COLUMN Caracteristicas varchar(500)

-- Exercicio 4
SELECT * FROM Raca

ALTER TABLE Raca DROP COLUMN Perdido

-- Exercicio 5
SELECT * FROM Personagem
SELECT * FROM Classe
SELECT * FROM Raca
SELECT * FROM Habilidade

INSERT INTO Raca(Nome, Descricao, Origem) VALUES
	('Saiyajin', 'Guerreiro alienigena', 'Planeta Vegeta'),
	('Orc','Gigante guerreiro' , 'Terra'),
	('Namekuseijin', 'Oponentes formidaveis', 'Namekusei')

INSERT INTO Habilidade(Nome, MultiplicadorPoder) VALUES
	('Kamehameha', 500),
	('Rajada de ki', 125),
	('Makankosappo', 250),
	('Galic Gun', 300)

INSERT INTO Classe(Nome, Caracteristicas) VALUES
	('Demoniaca', 'Poder de dar vida a demônios'),
	('Oozaru', null),
	('Guerreiro', 'Com bastante treino pode alcançar niveis de poder jamais imaginados')

SET DATEFORMAT DMY

INSERT INTO Personagem(Nome, Descricao, DataNascimento, IDRaca, IDClasse, Poder) VALUES	
	('Goku', 'Guereiro de classe baixa', '16-04-1980', 1, 3, 75),
	('Vegita', 'Principe dos Saiyajins', '07-11-1976', 1, 2, null),
	('Piccolo', 'Conquistador de mundos', '09-07-1958', 3, 1, 50),
	('Gohan', 'Filho de um saiyajin com uma terraquea', '08-12-2000', 2, 3, 500)

-- Exercicio 6
SELECT * FROM Classe

UPDATE Classe SET Caracteristicas = 'Caracteristicas Gerais' where Caracteristicas is null

-- Exercicio 7
SELECT * FROM Personagem

DELETE FROM Personagem WHERE YEAR(DataNascimento) between 1970 and 1990

-- Exercicio 8
SELECT * FROM Classe

-- Exercicio 9
SELECT Nome, DataNascimento, Poder FROM Personagem WHERE Poder between 0 and 75

-- Exercicio 10
SELECT Nome, Descricao, Origem FROM Raca WHERE Nome LIKE '%Orc%'
