<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 3</title>
	<meta charset="utf-8"/>
	<style>
	a{
		text-decoration: none;
	}
	</style>
</head>
<body>
		<?php 

		$altura = $_GET['altura'];
		$base = $_GET['base'];

		echo "A área do triângulo de base $base e altura $altura é ";
		$area=($altura*$base)/2;
		echo "$area";
		?>
	<br/>
	<a href = " http://localhost/DWE/20150909/ex3.html"><input type="button" name ="botao" value="voltar"/></a>
	<a href = "http://localhost/DWE/20150909/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>