--Adiciona a coluna
ALTER TABLE emp ADD COLUMN faixa  VARCHAR(1);
--Adiciona a coluna
ALTER TABLE emp DROP COLUMN faixa;


--copia os valores de faixa da tabela faixa_sal
UPDATE  emp
SET faixa = fa.faixa
FROM (
SELECT n_emp,salmin, salmax, f.faixa 
FROM faixa_sal AS f, emp 
WHERE sal BETWEEN salmin and salmax
) AS fa
WHERE emp.n_emp = fa.n_emp;

--b. (1,5) Crie um gatilho para quando um salário for atualizado, 
--a coluna faixa contenha a faixa salarial do funcionário.

CREATE FUNCTION f_atual_faixa() RETURNS trigger AS $$
	BEGIN
		UPDATE  emp
		SET faixa = fa.faixa
		FROM (
		SELECT n_emp,salmin, salmax, f.faixa 
		FROM faixa_sal AS f, emp 
		WHERE sal BETWEEN salmin and salmax
			) AS fa
		WHERE emp.n_emp = fa.n_emp;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER tg_atual_faixa
AFTER INSERT OR UPDATE
ON emp
FOR EACH ROW
EXECUTE PROCEDURE f_atual_faixa();