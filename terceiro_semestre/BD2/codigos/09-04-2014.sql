--criando sequence
CREATE SEQUENCE	testando

--usando função sem tabela
SELECT ROUND(100.2);

--rodando a sequence
SELECT nextval('testando');

--recuperar o ultimo valor da sequence
SELECT currval('testando');

--alterar o valor da sequence
SELECT setval('testando', 1);

--obter informações da sequence
SELECT * FROM testando;

--alterando a sequence
ALTER SEQUENCE testando INCREMENT 2;
SELECT nextval('testando');

--usando a sequence no insert

INSERT INTO emp VALUES	(900
						,'José'
						,'Anaista'
						,175
						,(SELECT ROUND(AVG(sal))	FROM emp WHERE cargo = 'Analista')
						,NULL
						,20
						);

--'tipo' serial
CREATE TABLE teste_serial(
	id serial,
	nome varchar(20),
	PRIMARY KEY(id)
);

--default
--se nao for informado um valor
--para a coluna, entao o valor 
CREATE TABLE teste_serial(
	id int DEFAULT 0,
	nome varchar(20),
);

--vai dar erro, porque ja tem 2 em id
INSERT INTO teste_serial VALUES(2,'teste');
SELECT * FROM teste_serial;

INSERT INTO teste_serial(nome) VALUES('teste');
SELECT * FROM teste_serial;
INSERT INTO teste_serial(nome) VALUES('teste');
SELECT * FROM teste_serial;

--visoes / views
CREATE VIEW emps_30 AS
SELECT *
FROM emp
WHERE n_dep=30;

--posso tratar view como uma tabela
SELECT *
FROM emps_30
WHERE cargo = 'Diretor';

--CRIANDO VIEW 2
CREATE VIEW emps_30_sem_sal AS
SELECT 	nome_emp
		,cargo
		,com
FROM emp
WHERE dep=30;

--DISTINCT = GROUP BY
SELECT DISTINCT n_dep
FROM emp

SELECT DISTINCT n_dep
FROM emp
GROUP BY n_dep;

--LIMIT AND OFFSET
SELECT *
FROM emp
ORDER BY sal DESC
LIMIT 4 OFFSET 2;

--Função de janela
SELECT nome_emp
		,sal
		,AVG(sal) OVER(PARTITION BY n_dep)
FROM	emp

SELECT nome_emp
		,sal
		,n_dep
		--,AVG(sal) OVER(PARTITION BY n_dep)
FROM	emp
ORDER BY n_dep;