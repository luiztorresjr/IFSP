--Aula do dia 09-10-2014 BD2

CREATE FUNCTION lista_dep() RETURNS SETOF dep AS $$
DECLARE
	v_dep dep%ROWTYPE;
BEGIN
	FOR i IN SELECT * FROM dep
	LOOP
		RETURN NEXT v_dep;
	END LOOP;
END;
$$ LANGUAGE plpgsql;
