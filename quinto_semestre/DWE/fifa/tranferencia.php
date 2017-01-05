<?php 
	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
	//dbh é a variavel que deve receber o pdo
 ?>
<!DOCTYPE html>
<html>
<head>
	<title>Tela de jogadores para traferencia</title>
	<style>
		a{
			text-decoration:none; 	
		}
		#idade{
			width: 20px;
		}
		#ger, #pot{
			width: 20px;
		}
	</style>
</head>
<body>
	<h1>Cadastro de jogadores para compra</h1>
	<form action="jogador.php">		
	<label for="nivel">Nivel GER-POT: </label>
	<input type="numeric" name="ger" id="ger" >
	<input type="numeric" name="pot" id="pot" >
	<br><br>
	<label for="nome">Nome: </label>
	<input type="text" name="nome" id="nome" required="required">
	<table>
		<tr>
			<td>
				<label for="pos" id="pos">Posição preferida: </label>
			</td>
			<td>
				<select name="pos" multiple="multiple" >
				<?php 
					foreach ($dbh->query('SELECT * FROM posicao ORDER BY cod_pos') as $linha) {
					 	echo "<option value=\"{$linha['pos']}\">{$linha['pos']}</option>";	
					} 
				 ?>
				 </select>
			 </td>
		  <br><br>
		  </tr>
	 </table>	
	 <label for="idade">Idade: </label>
	 <input type="numeric" name="idade" id="idade" required="required">
	 <br><br>
	 <label for="time">Time: </label>
	 <input type="text" name="time" id="time">
	 <label for="liga">Liga: </label>
	 <input type="text" name="liga" id="liga">
	 <br><br>
	 <label for="valor">Valor: </label>
	 <input type="text" name="valor" id="valor">
	 <label for="salario">Salario: </label>
	 <input type="text" name="salario" id="salario">
	 <br><br>
	<input type="submit" name ="botao" value="CADASTRAR" />
	<a href = " http://localhost/DWE/fifa/menuprincipal.html"><input type="button" name ="botao" value="VOLTAR"/></a>
	</form>
</body>
</html>
