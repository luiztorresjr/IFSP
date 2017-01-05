SELECT * FROM emp
WHERE cargo = 'Analista'--where filtra o atributo que vc seleciona

SELECT nome_emp,cargo FROM emp


SELECT nome_emp, cargo FROM emp
WHERE cargo = 'Analista' OR nome_emp = 'Ubaldo'--where filtra o atributos que vc seleciona

			

SELECT * FROM dep

SELECT nome_emp
	, cargo
	, sal
	, com
	,sal + COALESCE(com, 0)
FROM emp

WHERE sal BETWEEN 150000 AND  300000 -- isso é igual o comparativo de baixo
WHERE sal >= 150000 AND sal <= 300000 

SELECT nome_emp
	, cargo
	, sal
	, com
FROM emp
WHERE com IS NOT NULL

SELECT * FROM dep

INSERT INTO dep VALUES(50,'RH','HORTOLANDIA')

DELETE FROM dep WHERE n_dep = 50

DELETE FROM dep WHERE local_dep = 'Sao Paulo'--delete ele remove so os valores que foi solicitado



SELECT * FROM dep

UPDATE dep--atualiza um valor existente na tabela emp sal where indica onde sera atualizado
SET local_dep = 'Paulina'
WHERE n_dep = 40


SELECT * FROM emp

UPDATE emp--atualiza um valor existente na tabela emp sal 
SET sal = sal*1.1

SELECT 	n_emp
	,nome_emp
	,n_dep
	,nome_dep
	,local_dep
FROM emp
    ,dep

