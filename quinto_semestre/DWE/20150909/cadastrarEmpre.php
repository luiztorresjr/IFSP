<?php 
	$n_emp 	= $_POST['numero'];	
	$nome_emp = $_POST['nome'];
	$cargo = $_POST['cargo'];
	$chefe = $_POST['chefe'];
	$data_adm = $_POST['data'];	
	$sal = $_POST['salario'];
	$com = $_POST['comissao'];
	$n_dep = $_POST['departamento'];

	if($chefe == 0){
		$chefe= 'NULL';
	}
	if (empty($com)) {
		$com='NULL';
	}

	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
	//dbh é a variavel que deve receber o pdo
	
	$sql="INSERT INTO emp VALUES($n_emp, '$nome_emp', '$cargo', $chefe, '$data_adm', $sal, $com, $n_dep)"
	$dbh->prepare($sql);
	$resultado = $dbh->execute($sql);		
 ?>
 <!DOCTYPE html>
 <html>
	 <head>
	 	<title>Pagina 1</title>
	 	<meta charser="utf-8">
	 </head>
	 <body>
	<?php
      if($resultado){
        echo 'Inserido com sucesso!';
      }else{
        echo 'Erro!';
      }
    	?>
	 </body>
 </html>