<?php
  //criar um variável que receberá o pdo com o as informações de conexão do banco de dados
  //dbh é a variavel que deve receber o pdo

?>
<!DOCTYPE html>

<html>
  <head>
    <title>Página 1</title>
    <meta charset="utf-8" />
    <style>
      #nome{
        color: green;
		font-family: "century gothic"
      }    
      label{
        width: 10px; 
        display: inline-table;
        font-family: "century gothic";
		
      }
	  legend{
		font-family: "century gothic";
		background-color: #white;
	  }
	  
	  fieldset{
        background-color: #0099CC;
      }
	  
	  input[type=submit]{
		font-family: "century gothic";		
	  }
      
    </style>
  </head>
  <body>
    <form action="cadastrarEmpre.php" method="post">
      <fieldset>
        <legend>Cadastro Funcionário</legend>
		<br />
        <label for="numero">Número:</label>
        <input type="number" name="numero" id="numero" required="required"/>
        <br /><br />
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required="required"/>
        <br /><br />
		<label for="cargo">Cargo:</label>
        <input type="text" name="cargo" id="cargo" required="required"/>
		<br /><br />
		<label for="chefe">Chefe:</label>
        <select name="chefe">
        <option value="0">--->SEM CHEFE<---</option>
			<?php
			foreach($dbh->query('SELECT * FROM emp ORDER BY nome_emp')as $linha){
				echo "<option value =\"{$linha['n_emp']}\">{$linha['nome_emp']}</option>";
			}			
			?>
		</select>
        <br /><br />
		<label for="data">Data Admissao: </label>
        <input type="date" name="data" id="data" required="required"/>
        <br /><br />
		<label for="salario">Salário: </label>
        <input type="number" name="salario" id="salario" step="0.01" required="required"/>
        <br /><br />
		<label for="comissao">Comissao: </label>
        <input type="number" name="comissao" id="comissao"/>
        <br /><br />
		<label for="departamento">Departamento: </label>
		<select name="departamento">
			<?php
			foreach($dbh->query('SELECT * FROM dep ORDER BY nome_dep')as $linha){
				echo "<option value =\"{$linha['n_dep']}\">{$linha['nome_dep']}</option>";
			}			
			?>
		</select>        
        <br /><br />  
        <input type="submit" value="Cadastrar" />
      </fieldset>
    </form>
  </body>
</html>