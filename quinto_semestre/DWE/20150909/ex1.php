<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 1</title>
	<meta charset="utf-8"/>
	<style>
	a{
		text-decoration: none;
	}
	</style>
</head>
<body>	
	<?php 
		$num = $_GET['valor'];
		$cubo=pow($num, 3);
		echo "O cubo de $num é $cubo";
	 ?>
	 <br/>
	<a href = "http://localhost/DWE/20150909/ex1.html"><input type="button" name ="botao" value="voltar"/></a>
	<a href = "http://localhost/DWE/20150909/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>