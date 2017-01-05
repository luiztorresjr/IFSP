CREATE TABLE departamento(

 n_dep int,
 nome_dep varchar(20)NOT NULL,
 local_dep varchar(20),
 --comentario nescessita de dois --
 PRIMARY KEY(n_dep)--funciona tanto pra chave primaria simple ou compostas
 
);

DROP TABLE departamento;

SELECT * FROM departamento;

SELECT nome_dep, local_dep FROM departamento;

INSERT INTO departamento VALUES(10,'RH','Hortolândia');

-- INSERT INTO departamento (n_dep,nome_dep,local_dep) 
-- VALUES                   (10,'RH','Hortolândia');