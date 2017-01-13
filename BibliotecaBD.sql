create schema biblioteca;

use bibliotec;

CREATE TABLE Pessoa_tb(
    nome varchar(30),
    rg varchar(15),
    endereco varchar(40),
    senha varchar(30),
    PRIMARY KEY(rg)
    );
    
CREATE TABLE Usuario_tb(
    matricula varchar(15),
    quant_livros_locados int(5),
    rg_usuario char(15),
    cod_admin int(12),
    PRIMARY KEY(matricula),
    CONSTRAINT fk_usuario_pessoa FOREIGN KEY (rg_usuario) REFERENCES Pessoa_tb (rg),
    CONSTRAINT fk_usuario_admin FOREIGN KEY (cod_admin) REFERENCES Admin_tb (cod_admin)
);
   
CREATE TABLE Admin_tb(
    cod_admin int(12),
    rg_admin char(15),
    PRIMARY KEY(cod_admin),
    CONSTRAINT fk_admin_pessoa FOREIGN KEY (rg_admin) REFERENCES Pessoa_tb (rg)
    );
   
CREATE TABLE Professor_tb(
    disciplina varchar(20),
    matricula_prof varchar(15),
    rg_prof char(15),
    PRIMARY KEY(matricula_prof),
    CONSTRAINT fk_usuario_pessoa FOREIGN KEY (matricula_prof) REFERENCES Usuario_tb (matricula),
    CONSTRAINT fk_professor_pessoa FOREIGN KEY (rg_prof) REFERENCES Pessoa_tb (rg)
    );

CREATE TABLE Aluno_tb(
    curso varchar(20),
    serie varchar(3),
    matricula_aluno varchar(11),
    rg_aluno char(15),
    PRIMARY KEY(matricula_aluno),
    CONSTRAINT fk_aluno_usuario FOREIGN KEY (matricula_aluno) REFERENCES Usuario_tb (matricula),
    CONSTRAINT fk_aluno_pessoa FOREIGN KEY (rg) REFERENCES Pessoa_tb (rg)    
    );

    
    CREATE TABLE Livro_tb(
    titulo varchar(30),
    autor varchar(30),
    materia_relacionada varchar(30),
    genero char(20),
    estado_do_livro varchar(15),
    codigo char(10),
    isbn char(15),
    matricula varchar(11),
    estado int,
    PRIMARY KEY(codigo),
    CONSTRAINT fk_livro_aluno FOREIGN KEY (matricula) REFERENCES Aluno_tb(matricula_aluno)
);


CREATE TABLE Livrinhu_tb(
    nome_professor char(30),
    disciplina_professor varchar(30),
    codigo_l varchar(10),
    matricula_aluno varchar(11),
    matricula_prof varchar(11),
    PRIMARY KEY (codigo),
    CONSTRAINT fk_livrinhu_livros FOREIGN KEY (codigo_l) REFERENCES Livro_tb (codigo),
    CONSTRAINT fk_livrinhu_aluno FOREIGN KEY (matricula_aluno) REFERENCES Aluno_tb (matricula_aluno),
    CONSTRAINT fk_livrinhu_prof FOREIGN KEY (matricula_prof) REFERENCES Professor_tb (matricula_prof) 
);

  

INSERT INTO aluno_tb (nome,endereco,senha,curso,serie,matricula,rg)
VALUES('Adrieu','rua nao sei','asterisco','informatica','2nd','20141004001','numeros');

INSERT INTO aluno_tb (nome,endereco,senha,curso,serie,matricula,rg)
VALUES('Luacs','rua longe','asteriscos','informatica','2nd','40028922','');

INSERT INTO aluno_tb (nome,endereco,senha,curso,serie,matricula,rg)
VALUES('Taizinha','rua mais longe','asteriscoss','informatica','2nd','20141004000','numerosinhu');

INSERT INTO Livro_tb (titulo,autor,materia_relacionada,genero,estado_do_livro,codigo,isbn)
VALUES('AS AVENTURAS DE NINGUEM','Quem sabe','Filosofia','loucura','pensando','001','2002');


INSERT INTO Livro_tb (titulo,autor,materia_relacionada,genero,estado_do_livro,codigo,isbn)
VALUES('Joana e o pé de arroz','Anonimo da silva','Gramática','Conto','Novo','002','2003');

INSERT INTO Livro_tb (titulo,autor,materia_relacionada,genero,estado_do_livro,codigo,isbn)
VALUES('Pelé rei do futebol','Zeca pagodinho','Matemática','Samba','Desgastado','003','2004');

INSERT INTO Professor_tb (nome,endereco,senha,matricula,rg,disciplina)
VALUES('Tiago Brasileiro','rua do melhor professor','tiagoamanamorada','2014102020','numerodorg','Banco de Dados');


INSERT INTO Professor_tb (nome,endereco,senha,matricula,rg,disciplina)
VALUES('Henrique Cunha','rua do 2nd melhor professor','henriqueamalinux','2014102021','numerodorg2','Sistemas Operacionais');


INSERT INTO Professor_tb (nome,endereco,senha,matricula,rg,disciplina)
VALUES('Katyusco','rua do professor','katyamaaleatorio','2014102022','numerodorg3','Progamacao orientada a objetos');

INSERT INTO Admin_tb (nome,endereco,senha,rg,cod_admin)
VALUES ('juaum','rua do admin','dificil','numerosinhos','10000004');

INSERT INTO Admin_tb (nome,endereco,senha,rg,cod_admin)
VALUES ('Maria','melior rua','senha_da_maria','5550123','10000005');

INSERT INTO Admin_tb (nome,endereco,senha,rg,cod_admin)
VALUES ('Joao','MinhaRua','joao2014','3623851','10000006');

SELECT titulo, autor 
FROM Livro_tb;

SELECT *
FROM Livro_tb;

SELECT COUNT titulo
FROM Livro_tb;

SELECT titulo, autor, status
FROM Livro_tb
WHERE status = 1;

SELECT *
FROM Livro_tb
WHERE status = 1;

SELECT nome, matricula, titulo, codigo, status
FROM Usuario_tb
LEFT JOIN Livro_tb
ON status = 2;

SELECT nome_professor, disciplina_professor, curso, serie
FROM Livros_sugeridos
INNER JOIN Aluno_tb
ON codigo = matricula; 

SELECT titulo, autor, status
FROM Livro_tb
WHERE status = 2;

SELECT * 
FROM Livro_tb
WHERE status = 2;

SELECT nome, matricula
FROM Aluno_tb;

SELECT * 
FROM Aluno_tb;

SELECT nome, matricula
FROM Professor_tb;

SELECT * 
FROM Professor_tb;

SELECT nome, matricula
FROM Usuario_tb;

SELECT *
FROM Usuario_tb;
SELECT nome, cod_admin
FROM Admin_tb;

SELECT *
FROM Admin_tb;

SELECT nome, rg
FROM Pessoa_tb;

SELECT * 
FROM Pessoa_tb;

SELECT titulo, codigo, nome_professor, disciplina_professor
FROM Professor_tb
FULL JOIN  Livrinhu_tb
ON matricula_prof = codigo;

SELECT *
FROM Professor_tb
FULL JOIN Livrinhu_tb
ON matricula_prof = codigo;
