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
      label{
        display: inline-block;
        width: 125px;
      }
    </style>
  </head>
  <body>
    <form action="cadastrar_emp.php" method="post">
      <fieldset>
        <legend>Cadastrar Funcionário</legend>
        <label for="n_emp">Número:</label>
        <input type="number" name="n_emp" id="n_emp" required="required"/>
        <br />        
        <label for="nome_emp">Nome:</label>
        <input type="text" name="nome_emp" id="nome_emp" required="required"/>
        <br />
        <label for="cargo">Cargo:</label>
        <input type="text" name="cargo" id="cargo" required="required"/>
        <br />
        <label for="chefe">Chefe:</label>
        <select name="chefe">
          <option value="0">-->SEM CHEFE<--</option>
          <?php
            foreach($dbh->query('SELECT n_emp, nome_emp FROM emp ORDER BY nome_emp') as $linha){
              echo "<option value=\"{$linha['n_emp']}\">{$linha['nome_emp']}</option>";
            }
          ?>
        </select>
        <br />
        <label for="data_adm">Data Admissão:</label>
        <input type="date" name="data_adm" id="data_adm" required="required"/>
        <br />
        <label for="sal">Salário:</label>
        <input type="number" name="sal" id="sal" step="0.01" min="0.01" required="required"/>
        <br />
        <label for="com">Comissão:</label>
        <input type="number" name="com" id="com" step="0.01" min="0.01" />
        <br />
        <label for="n_dep">Departamento:</label>
        <select name="n_dep">
          <?php
            foreach($dbh->query('SELECT n_dep, nome_dep FROM dep ORDER BY nome_dep') as $linha){
              echo "<option value=\"{$linha['n_dep']}\">{$linha['nome_dep']}</option>";
            }
          ?>
        </select>
        <br />         
        <input type="submit" value="Cadastrar" />
      </fieldset>
    </form>
  </body>
</html>
