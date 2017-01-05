--como alterar tabela
ALTER TABLE nome da tabela Column nome da coluna SET colocar o valor

--JOIN selecionar mais de uma tabela
SELECT *
FROM	tabela1 AS sd
		tabela2 AS ds--AS ds para renomear tanto a tabela quanto  as colunas

-- INNER JOIN serve para juntar as tabelas
SELECT 	e.n_emp,
	e.nome_emp,
	e.n_dep AS n_dep_e,
	d.n_dep AS n_dep_d
FROM emp AS e
INNER JOIN dep AS d
	ON(e.n_dep = d.n_dep);

-- RIGHT JOIN serve para juntar as tabelas retornado todas as linha mesmo que não tenha correspondente na tabela a esquerda
SELECT 	e.n_emp,
	COALESCE(e.nome_emp,'----'),--substitui o valor caso seja null pela string ----
	e.n_dep AS n_dep_e,
	d.n_dep AS n_dep_d
FROM	emp AS e
RIGHT JOIN dep AS d
	ON(e.n_dep = d.n_dep);
	
-- LEFT JOIN serve para juntar as tabelas retornado a junção da tabela da esquerda com a da direita;
SELECT 	e.n_emp,
	COALESCE(e.nome_emp,'----'),--substitui o valor caso seja null pela string ----
	e.n_dep AS n_dep_e,
	d.n_dep AS n_dep_d
FROM	emp AS e
LEFT JOIN dep AS d
	ON(e.n_dep = d.n_dep);
	
--FULL JOIN junta todas as tabelas 
SELECT 	e.n_emp,
	COALESCE(e.nome_emp,'----'),--substitui o valor caso seja null pela string ----
	e.n_dep AS n_dep_e,
	d.n_dep AS n_dep_d
FROM	emp AS e
FULL JOIN	dep AS d
	ON(e.n_dep = d.n_dep);

--
SELECT 	e.n_emp,
	COALESCE(e.nome_emp,'----'),--substitui o valor caso seja null pela string ----
	e.n_dep AS n_dep_e,
	fj.n_dep AS n_dep_d
FROM	emp AS e
FULL JOIN (SELECT * FROM dep WHERE local_dep = 'Campinas') AS fj
	ON(e.n_dep = fj.n_dep);

-- UNION serve para juntar duas operações caso sejam necessario pegar valores que sejam obtidos atraves de duas operações
SELECT 	n_dep,nome_emp
FROM 	emp
UNION
SELECT 	n_dep, nome_dep
FROM 	dep

--intersect pega somente o que tem nas duas tabelas
SELECT 	n_dep--,nome_emp
FROM 	emp
INTERSECT
SELECT 	n_dep--, nome_dep
FROM 	dep

--except tem em uma tabem mas não tem em outra
SELECT 	n_dep,nome_emp
FROM 	emp
EXCEPT
SELECT 	n_dep, nome_dep
FROM 	dep

--order by orderna em relação a uma coluna neste caso o sal dos empregados se colocar sem paramentro ASC ou DESC o default e DESC
SELECT 	nome_emp, sal		
FROM 	emp
ORDER BY sal, nome_emp ASC--pode ser ordenado por duas mais colunas por ex: ORDER BY sal, nome_emp 

--GROUP BY Separa os select pela informção do GROUP BY nome da tabela declarada 
SELECT	cargo,
		MAX(sal),
		MIN(sal),
		MAX(sal)-MIN(sal),
		COUNT(*)
FROM	emp
GROUP BY cargo;

--sub consulta utilizada caso queira usar um parametro par porcurar algo 
SELECT	nome_emp
FROM	emp
WHERE sal = (SELECT MAX(sal) FROM emp);

--HAVING usado para separar neste caso os departamentos que tem 3 funcionarios pelo menos
SELECT 	n_dep,
		COUNT(*)
FROM	emp
GROUP BY n_dep
HAVING COUNT(*) >= 3;

--ANY verifica se existe pelo menos uma verdade então retorna o nome e o salario neste caso retona silva e o seu salario
SELECT	nome_emp,
		sal
FROM	emp
WHERE n_emp = 103
	AND sal> ANY(SELECT sal FROM emp);
	
--ALL retona o valor somente e somente se as condições forem verdade
SELECT	nome_emp,
		sal
FROM	emp
WHERE n_emp = 103
	AND sal> ALL (SELECT sal FROM emp);

--PARA encontrar os chefes de cada funcionario
SELECT	n_dep,
		nome_emp,
		chefe
FROM emp

SELECT	nome_emp
FROM	emp
WHERE	n_emp IN ( SELECT chefe--DISTINCT chefe-- funciona tanto com o GROUP BY ou com o DISTINCT
		   FROM	emp
		   GROUP BY chefe
		 )
--PARA encontrar  funcionario que não são chefes
SELECT	n_dep,
		nome_emp,
		chefe
FROM emp

SELECT	nome_emp
FROM	emp
WHERE	n_emp NOT IN ( SELECT chefe--DISTINCT chefe-- funciona tanto com o GROUP BY ou com o DISTINCT
		   FROM	emp
		   GROUP BY chefe
		 )
		 
--SEQUENCE CRIA AUTOMATICAMENTE O ID A CADA ITEM ACRESCENTADO 
CREATE TABLE teste_serial
(
	id serial,
	nome VARCHAR(30),
	PRIMARY KEY(id)
);

INSERT INTO teste_serial(nome)
VALUES('TESTE');

INSERT INTO teste_serial
VALUES(DEFAULT, 'TESTE');


SELECT * FROM teste_serial;

INSERT INTO teste_serial--NÃO IRA FUNCIONAR PORQUE JA TEM UM VALOR NO ID = 2
VALUES(2, 'TESTE');

--CREATE VIEW CRIA UMA VIEW ESPECIFICA PARA ALGO QUE FOI SELECIONADO NO SELECT
CREATE VIEW deps_30 AS
SELECT * FROM emp
WHERE n_dep = 30;

--TRANSAÇÕES
--INICIA
BEGIN;

---COMANDOS

--TERMINA
COMMIT;
--COMMIT-- OU ROLLBACK SE DAR COMMIT SERÁ ENVIADO O COMANDO SE DER ROLLBACK O COMANDO SERA CANCELADO E NÃO SERA ENVIDO AO BD 
