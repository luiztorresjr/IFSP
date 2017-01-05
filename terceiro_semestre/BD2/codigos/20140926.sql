--PARA SE FAZER TANTO AS FUNÇõES atraves do usuario post portanto o principal 
DROP ROLE;

CREATE ROLE usuario1 PASSWORD '1234' LOGIN;

GRANT --concede privilegio
REVOKE -- revoga privilegio

--Tipo de privilegio que pode ser concedido
--SELECT	--REFERENCES
--INSERT	--CREATE
--UPDATE	--

--GRANT e REVOKE como usa:
GRANT privilegio ON objeto TO usuario [WITH GRANT OPTION]
GRANT SELECT ON emp TO usuario1; 

GRANT ALL PRIVILEGES ON emp, dep TO usuario1;
REVOKE ALL PRIVILEGES ON emp FROM usuario1;
--cria um schema e autoriza o usuario2 as funções todas
CREATE SCHEMA usuario2 AUTHORIZATION usuario2;

DROP SCHEMA usuario2;

--SLIDE 7
CREATE ROLE RH PASSWORD '1234' LOGIN