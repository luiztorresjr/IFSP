DROP TABLE conta;
CREATE TABLE conta
(
	cod_conta INTEGER,
	saldo	INTEGER,
	PRIMARY KEY(cod_conta)
);


INSERT INTO conta VALUES(1, 1000);
INSERT INTO conta VALUES(2, 200);

SELECT * FROM conta;

BEGIN;
	UPDATE conta
	SET saldo = saldo - 200
	WHERE cod_conta = 1;
	
	UPDATE conta
	SET saldo = saldo + 200
	WHERE cod_conta = 2;
COMMIT;--
--ROLLBACK;--retorna o valor mais apenas se a operação tiver uma inicio BEGIN, pode encerrar a sessao com ROLLBACK ou COMMIT

BEGIN TRANSACTION ISOLATION UNCOMMIT
---------------------------------------------------------------------------------------------------------
BEGIN;
	UPDATE conta
	SET saldo = 10000
	WHERE cod_conta = 1;
COMMIT;
--Se rodar os dois update ao mesmo tempo na mesma linha ira travar;
BEGIN;
	UPDATE conta
	SET saldo = 10000
	WHERE cod_conta = 1;
COMMIT;	
--------------------------------------------------------------------------------------------
BEGIN TRANSACTION ISOLATION LEVEL SERIALIZABLE;----é uma boa função para criar relatorios pois não afeta mesmo que de commit em uma outra operação
	SELECT * FROM conta;
COMMIT;


BEGIN;
	UPDATE conta
	SET saldo = 100
	WHERE cod_conta = 1;
COMMIT;	
--------------------------------------------------------------------------------------------------
para verificar a versão da linha 

SELECT xmin, xmax, * FROM conta;

--pg xlog pasta do pg adm no meu computador no arquivo de programas