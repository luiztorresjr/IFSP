SELECT nome_emp
      , emp.n_dep
      , dep.*
FROM emp
     , dep

--INNER JOIN dep
--	ON(dep.n_dep = emp.n_dep)

WHERE dep.n_dep = emp.n_dep

WHERE dep.n_dep    =emp.n_dep
	AND dep.local_dep = 'Campinas'

SELECT nome_emp
	,sal
	,faixa_sal.*
	,dep.nome_dep
FROM emp
	,faixa_sal
	,dep

WHERE emp.sal >= faixa_sal.salmin
     AND emp.sal <= faixa_sal.salmax
     AND dep.n_dep = emp.n_dep	
     AND faixa_sal.faixa IN('C' , 'E')
     AND ( faixa_sal.faixa = 'C'
     OR faixa_sal.faixa ='E')
     
SELECT nome_emp
	,emp.n_dep
	,dep.*
FROM emp
RIGHT OUTER JOIN dep---eh nescessario Colocar qual tabela que esta RIGHT OU LEFT
	ON (dep.n_dep = emp.n_dep)

INSERT INTO emp VALUES (300 --n_emp
			,'BD1' --nome_dep
			,'Analista' --cargo
			,103 --cod chefe
			,'2014-06-16' --DATA_ADM
			,150000
			,NULL
			) 
SELECT * FROM emp

SELECT f.n_emp
      ,f.nome_emp
      ,f.chefe
      ,c.n_emp
      ,c.nome_emp
      ,c.chefe
FROM emp AS F
     ,emp AS c

WHERE f.chefe = c.n_emp


