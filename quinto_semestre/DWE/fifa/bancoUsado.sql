DROP TABLE IF EXISTS posicao;
CREATE TABLE posicao(
	cod_pos serial NOT NULL,
	linha varchar(50),
	pos varchar(50),
	PRIMARY KEY(cod_pos)
);

insert into posicao (linha, pos) values('Goleiro', 'GOL');
insert into posicao (linha, pos) values('Defesa', 'SW');
insert into posicao (linha, pos) values('Defesa', 'ALD');
insert into posicao (linha, pos) values('Defesa', 'RB');
insert into posicao (linha, pos) values('Defesa', 'ZAG');
insert into posicao (linha, pos) values('Defesa', 'LB');
insert into posicao (linha, pos) values('Defesa', 'ALE');
insert into posicao (linha, pos) values('Meio campo', 'VOL');
insert into posicao (linha, pos) values('Meio campo', 'MD');
insert into posicao (linha, pos) values('Meio campo', 'MC');
insert into posicao (linha, pos) values('Meio campo', 'ME');
insert into posicao (linha, pos) values('Meio campo', 'CAM');
insert into posicao (linha, pos) values('Ataque', 'PD');
insert into posicao (linha, pos) values('Ataque', 'CF');
insert into posicao (linha, pos) values('Ataque', 'PE');
insert into posicao (linha, pos) values('Ataque', 'AAD');
insert into posicao (linha, pos) values('Ataque', 'ATA');
insert into posicao (linha, pos) values('Ataque', 'ATE');

select * from posicao;

DROP TABLE IF EXISTS transferencia;
create table transferencia(
	cod_trans SERIAL NOT NULL,
	ger integer,
	pot integer,
	nome varchar(50),
	pos varchar(50),
	idade integer,
	time varchar(50),
	liga varchar(50),
	valor numeric(10,2),
	salario numeric(5,2),
	PRIMARY KEY(cod_trans)
);

select * from transferencia;

DROP TABLE IF EXISTS plantel;
create table plantel(
	cod_plantel SERIAL NOT NULL,
	PRIMARY KEY(cod_plantel)
);

select * from plantel;

DROP TABLE IF EXISTS esquema;
create table esquema(
	cod_esquema SERIAL NOT NULL,
	esquema varchar(50),
	gol varchar(50),
	zag varchar(50),
	meio varchar(50),
	ata varchar(50),
	PRIMARY KEY(cod_esquema)
);

insert into esquema (esquema, gol, zag, meio, ata) values('3-4-1-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('3-4-2-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('3-4-3', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('3-5-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-1-2-1-2', 'GOL','LB,ZAG,ZAG,RB','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-1-2-1-2(2)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-1-4-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-2-2-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-2-3-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-2-3-1(2)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-1-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-2-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-3', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-3(2)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-3(3)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-3(4)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-3-3(5)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-4-1-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-4-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-4-2(2)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-5-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('4-5-1(2)', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('5-2-1-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('5-2-2-1', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');
insert into esquema (esquema, gol, zag, meio, ata) values('5-3-2', 'GOL','ZAG,ZAG,ZAG','CM,CM,CAM,MD,ME','ST,ST');

select * from esquema;
