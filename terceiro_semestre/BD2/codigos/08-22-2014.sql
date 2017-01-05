--1.  Adicione a restrição de NOT NULL na  coluna com da  tabela emp. O 
--que acontece e por quê?

ALTER TABLE emp ALTER COLUMN com SET NOT NULL
-- Reposta : OCORRE UM ERRO POIS HÁ VALORE NULOS NA COLUNA,


--2.  Calcule o salário hora de cada funcionário, considerando o mês com 
--220 horas.
SELECT 	nome_emp
		,sal/220
FROM emp;

--3.  Calcule o salário mais a comissão que o funcionário recebe. Pesquisa 
--sobre a função COALESCE para apresentar o resultado corretamente.
SELECT 	nome_emp
	,sal	
	,com
	,COALESCE(com+sal, 0)
FROM emp;

--4.  Selecione os departamentos que não tem funcionários.
SELECT *
FROM dep AS d
WHERE	d.n_dep NOT IN(SELECT e.n_dep
				FROM emp AS e);				
--5.  Consulte os funcionários que são vendedores e não tem comissão.
SELECT *
FROM emp
WHERE	cargo = 'Vendedor' AND com = 0 OR com = NULL

--6.  Liste os funcionários que são chefes.

SELECT	*
FROM	emp 
WHERE (n_emp) IN (SELECT chefe FROM emp)

--7.  Liste o nome do funcionário seguido do nome de seu  chefe. Caso não 
--possua chefe, liste “-------“. Utilize novamente a função COALESCE.


--8.  Consulte  o  nome  do  funcionário  e  o  salário  dos  funcionários  que 
--estão na mesma faixa salarial de seus chefes.


--9.  Liste o nome do funcionário que tem o menor salário.

SELECT	nome_emp
	,sal
FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp);

--10.  Faça  a  soma  dos  salários  dos  funcionários  do  departamento  de 
--Administração ou Vendas.

--11.  Liste a média salarial de todos os departamentos, com exceção do 
--departamento 30.

--12.  Liste a média salarial dos funcionários pela faixa salarial em que se 
--encontram.

--13.  Aumente o salário em 10% para os funcionários mais antigos de cada 
--departamento.

--14.  Promova a diretor os funcionários que recebam mais do que a média 
--salarial de seus cargos. 