--Comando em bloco

CREATE FUNCTION teste() RETURN int AS $$--abre o corpo da função $$
BEGIN		---BEGIN nao pode ter ;(ponto-e-virgula)
	RETURN 1;
END;
$$ LANGUAGE plpgsql;--fecha o corpo da função $$

--------------------------------------------------------------------------------------------
--sobrecarga de metodos
CREATE FUNCTION soma(n1 int, n2 int) RETURN int AS $$--abre o corpo da função $$
BEGIN		---BEGIN nao pode ter ;(ponto-e-virgula)
	RETURN n1+n2;
END;
$$ LANGUAGE plpgsql;--fecha o corpo da função $$

----------------------------------------------------------------------------------------------


CREATE FUNCTION soma(n1 int, n2 int, n3 int) RETURNS int AS $$--abre o corpo da função $$
BEGIN		---BEGIN nao pode ter ;(ponto-e-virgula)
	RETURN n1+n2+n3;
END;
$$ LANGUAGE plpgsql;--fecha o corpo da função $$

-------------------------------------------------------------------------------------------------


CREATE FUNCTION soma(n1 int, n2 int, n3 int) RETURNS int AS $$--abre o corpo da função $$
BEGIN		---BEGIN nao pode ter ;(ponto-e-virgula)
	RETURN soma(n1,n2)+n3;
END;
$$ LANGUAGE plpgsql;--fecha o corpo da função $$

--DROP TABLE

DROP FUNCTION soma(int, int, int);

-----------------------------------------------------------------------------------------------------
CREATE FUNCTION soma(int, int) RETURNS int AS $$--abre o corpo da função $$
DECLARE
	n1 ALIAS FOR $1;
	n2 ALIAS FOR $2;

BEGIN		---BEGIN nao pode ter ;(ponto-e-virgula)
	RETURN soma(n1,n2)+n3;
END;
$$ LANGUAGE plpgsql;--fecha o corpo da função $$

--DROP TABLE

DROP FUNCTION soma(int, int, int);

------------------------------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION calcular(n1 int, n2 int, OUT soma int) AS $$
BEGIN
	soma := n1+n2;
END;
$$ LANGUAGE plpgsql;

-----------------------------------------------------------------------------------------------------------

CREATE FUNCTION teste_row_type() RETURNS varchar AS $$
DECLARE
	linha_emp emp%ROWTYPE;
BEGIN
	linha_emp.nome_emp := 'Teste';
END;
$$ LANGUAGE plpgsql;	
	
--------------------------------------------------------------------------------------------------------------------
CREATE FUNCTION retornar_nome(v_n_emp int) RETURNS varchar AS $$
DECLARE
	v_nome_emp emp.nome_emp%TYPE;
BEGIN
	SELECT nome_emp
		INTO v_nome_emp
	FROM emp
	WHERE emp.n_emp = v_n_emp;

	RETURN v_nome_emp;
END;
$$ LANGUAGE plpgsql;

select *
FROM retornar_nome(110);
---------------------------------------------------------------------------------------------------------------------
CREATE FUNCTION
cadastrar_dep(v_n_dep, v_nome_dep, v_local_dep) 
RETURNS void AS $$

------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION exemploNext()