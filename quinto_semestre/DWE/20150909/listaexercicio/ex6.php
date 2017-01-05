<!DOCTYPE html>
<html>
<head>
	<title>Exercicio 6</title>
	<meta charset="utf-8"/>
	<style>
		a{
			text-decoration: none;

		}
		table, td{
			border: solid 2px;
			border-collapse: collapse;
		}
		thead {
	    		display: table-header-group;
	    		vertical-align: middle;
	    		border-color: inherit;
		} 
	</style>
</head>
<body>
		<?php 
			$linha = $_GET['linha'];
			$coluna = $_GET['coluna'];
			$l=1;
			$c=1;
			echo "<table align=center>";
			echo "<thead><h3 align=center>Tabela</h3></thead>";
				echo "<tbody>";
				for ($l=1; $l <= $linha; $l++) { 
					echo "<tr align=center>";
					for($c=1 ;$c <= $coluna;$c++){				
						echo "<td >linha$l,coluna$c</td>";
					}
					echo "</tr>";			
				}
				echo "</tbody>";
			echo "</table>";
		?>
	<br/>
	<a href = "http://localhost/DWE/20150909/listaexercicio/ex6.html"><input type="button" name ="botao" value="voltar"/></a>
	<a href = "http://localhost/DWE/20150909/listaexercicio/menuprincipal.html"><input type="button" name ="botao" value="Menu Principal"/></a>
</body>
</html>