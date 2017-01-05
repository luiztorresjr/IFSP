<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 4</title>
	<meta charset="utf-8"/>
	<style>
		a{
			text-decoration: none;
		}
	</style>
</head>
<body>
		<?php 
			$n1 = $_GET['num1'];
			$n2 = $_GET['num2'];
			$n3 = $_GET['num3'];
			$media=($n1 + $n2 + $n3)/3;

			echo "A média aritmética simples de $n1, $n2 e $n3 é $media";
		?>
	<br/>
	<a href = " http://localhost/DWE/20150909/ex1.html"><input type="button" name ="botao" value="voltar"/></a>
	<a href = "http://localhost/DWE/20150909/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>