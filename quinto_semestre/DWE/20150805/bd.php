<?php
  //criar um variável que receberá o pdo com o as informações de conexão do banco de dados
  //dbh é a variavel que deve receber o pdo
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Página 1</title>
    <meta charset="utf-8">
  </head>
  <body>
    <?php
      foreach($dbh->query('SELECT * FROM dep') as $linha){
        echo "Nome: {$linha['nome_dep']} <br />";
        echo "Local: {$linha['local_dep']} <br />";
        echo '<hr />';
      }
    ?>
  </body>
</html>
