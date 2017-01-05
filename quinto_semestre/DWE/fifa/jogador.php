<?php 
	$nome = $_GET['nome'];
	$local = $_GET['local'];
	$opcao = isset()$_GET['opcao']) ? $_GET['opcao']='';

	//Filtra por nome e local
	if(!empty($nome) && !empty($local)){
		if($opcao == "e"){
			$op = "AND";
		}
		else{
			$op = "OR";
		}
		$sql = "SELECT * FROM dep WHERE nome_dep = '$nome' $op local_dep = '$local'";		
	}
	//Filtra por nome
	else if(!empty($nome)){
		$sql = "SELECT * FROM dep WHERE nome_dep = '$nome'";
	}
	//Filtra local
	else if(!empty($local)){
		$sql = "SELECT * FROM dep WHERE local_dep = '$local'";
	}
	//Lista tudo 
	else{
		
		$sql = "SELECT * FROM dep";
	}

	///criar um variável que receberá o pdo com o as informações de conexão do banco de dados
  //dbh é a variavel que deve receber o pdo

 ?>
 <!DOCTYPE html>
 <html>
	 <head>
		<title>Resultado</title>
	 </head>
	 <body>
		<?php 
		foreach($dbh->query($sql) as $linha){
			echo "Nome: {$linha['nome_dep']}<br />";
			echo "local: {$linha['local_dep']}<br />";
			echo "<hr />";
		}	
		 ?>
	 </body>
 </html>