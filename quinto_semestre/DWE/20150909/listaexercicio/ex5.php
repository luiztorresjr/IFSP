<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 5</title>
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
			$menor=min($n1,$n2,$n3);
			$maior=max($n1, $n2, $n3);
			$media1=((3*$media)-$menor)/2;

			echo "A média aritmética simples de <b>$n1</b>, <b>$n2</b> e <b>$n3</b> é <b>$media</b><br/>";
			echo "O maior valor é <b>$maior</b> e o menor é <b>$menor </b><br/>";
			echo "A média dos dois maiores é <b>$media1</b><br/>";

		?>
	<br/>
	<a href = " http://localhost/DWE/20150909/listaexercicio/ex5.html"><input type="button" name ="botao" value="voltar"/></a>
	<a href = "http://localhost/DWE/20150909/listaexercicio/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>