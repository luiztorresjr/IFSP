--DROP TABLE teste;

CREATE TABLE teste(
	a int PRIMARY KEY,
	b int ,
	c int ,
	UNIQUE (b, c)
);

SELECT * FROM teste;

INSERT INTO teste(a,b,c) VALUES(1,2,3);
INSERT INTO teste(a,b,c) VALUES(2,3,2);
INSERT INTO teste(a,b,c) VALUES(4,NULL,1);
INSERT INTO teste(a,b,c) VALUES(3,1,1);