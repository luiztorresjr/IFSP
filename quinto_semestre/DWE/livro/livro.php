<?php 
 /*
create table livro(
    id_livro integer auto_increment not null,
    titulo varchar(50),
    autor varchar(50),
    n_pagina integer,
    PRIMARY KEY(id_livro)
);
 */
	//$id = $_GET['id'];
	$titulo = $_GET['titulo'];
	$autor = $_GET['autor'];
	$npagina = $_GET['npagina'];
	$op = $_GET['botao'];
	
	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
  //dbh é a variavel que deve receber o pdo
	
	if($op =='cadastrar'){
		$sql = "insert into livro (titulo, autor, n_pagina) values('$titulo', '$autor', $npagina)";
	}else if($op =='consultar'){
		$sql = "select * from livro"; 
	}
 ?>

 <!DOCTYPE html>
 <html>
 <head>
 	<title>
		Resultado
 	</title>
 </head>
 <body>
 	<?php 
		if($op =='cadastrar'){
			$b=$dbh->prepare($sql);
			if($b==true){
				$b->execute();
				echo "<h1>Gravado com sucesso<h1/><br />";
			}else{
				echo "<h1>Erro ao gravar<h1/><br />";
			} 
		}else{
			foreach($dbh->query($sql) as $linha){
				echo "Id: {$linha['id_livro']} <br />"
				echo "Titulo: {$linha['titulo']} <br />";
				echo "Autor: {$linha['autor']} <br />";
				echo "Número de páginas: {$linha['n_pagina']} <br />";
				echo '<hr />';
			}
		}		
 	 ?>
 </body>
 </html>
 
