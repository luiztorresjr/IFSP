<?php
  $numero = $_GET['numero'];
  $nome   = $_GET['nome'];
  $local  = $_GET['local'];
  
	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
	//dbh é a variavel
  $sql = "INSERT INTO dep VALUES ($numero, '$nome', '$local')";

  $resultado = $dbh->exec($sql);
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Resultado</title>
    <meta charset="utf-8" />
  </head>
  <body>
    <?php
      if($resultado > 0){
        echo '<p>Cadastro feito com sucesso!</p>';
      }else{
        echo '<p>Cadastro não realizado!</p>';
      }
    ?>
  </body>
</html>
