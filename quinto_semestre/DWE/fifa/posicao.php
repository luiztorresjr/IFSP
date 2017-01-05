<?php 
 /*
DROP TABLE posicao;
CREATE TABLE posicao(
	cod_pos serial NOT NULL,
	linha varchar(50),
	pos varchar(50),
	PRIMARY KEY(cod_pos)
);
 */
$linha = $_GET['linha'];
$pos = $_GET['pos'];


//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
  //dbh é a variavel que deve receber o pdo

$sql="insert into posicao (linha, pos) values('$linha','$pos')";
$b=$dbh->prepare($sql);
	
 ?>
 <!DOCTYPE html>
 <html>
 <head>
 	<title>Tela de confirmação</title>
 	<style>
	a{
		text-decoration: none;
	}
 	</style>
 </head>
 <body>
 	<?php 
 	if($b==true){
		$b->execute();
		echo "<h1>Gravado com sucesso<h1/><br />";
	}else{
		echo "<h1>Erro ao gravar<h1/><br />";
	} 	
 	?>
 	<a href = " http://localhost/DWE/fifa/menuprincipal.html"><input type="button" name ="botao" value="MENU PRINCIPAL"/></a>
 	<a href = "http://localhost/DWE/fifa/CadastroPosicao.html"><input type="button" name ="botao" value="VOLTAR"/></a></a>
 </body>
 </html>