-- apagando a sequence
DROP SEQUENCE testando

-- criando sequence
CREATE SEQUENCE testando

-- usando função sem tabela
SELECT ROUND (100.2);

-- 'rodando' a sequence
SELECT nextval('testando');

--recuperar o ultimo  valor da sequence
SELECT currval ('testando');

--alterar o valor da sequence
SELECT setval('testando',1);

--obter informação da sequence
-- comportamento do post
SELECT * FROM testando;

-- alterando a sequence usando o ALTER
ALTER SEQUENCE testando INCREMENT 2;
SELECT nextval ('testando');

-- usando a sequence no insert
INSERT INTO dep VALUES(nextval('testando'), 'RH',Hortolândia);
SELECT * FROM dep;

--criando com um valor start with
CREATE SEQUENCE test START WHILE (40);

--usando a sequence no insert
--inserindo um novo funcionario 
INSERT INTO emp VALUES(900,'Jose','Analista',175,'2014-09-04'
						,(SELECT ROUND(AVG(sal)) FROM emp WHERE cargo = 'Analista'
						,NULL
						,2014-09-04
						);
--tipo serial
