<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 2</title>
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
		$mult=$n1*$n2;
		echo "A multiplicação de <b>$n1</b> por <b>$n2</b> é <b>$mult</b>";		
		 ?>
		 <br/>
		 <a href = "http://localhost/DWE/20150909/ex2.html"><input type="button" name ="botao" value="voltar"/></a>
		 <a href = "http://localhost/DWE/20150909/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>