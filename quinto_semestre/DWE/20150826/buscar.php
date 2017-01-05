<?php
  $nome  = $_GET['nome'];
  $local = $_GET['local'];
  $opcao = isset($_GET['opcao']) ? $_GET['opcao'] : ''; //operador ternário
 
  if(!empty($nome) && !empty($local)){
    if($opcao == "e"){
      $op = 'AND';
    }else{
      $op = 'OR';
    }
    //Filtar por nome e local
    $sql = "SELECT * FROM dep WHERE nome_dep = '$nome' $op local_dep = '$local'";
  }else if(!empty($nome)){
    //Filtrar por nome
    $sql = "SELECT * FROM dep WHERE nome_dep = '$nome'";
  }else if(!empty($local)){
    //Filtrar por local
    $sql = "SELECT * FROM dep WHERE local_dep = '$local'";
  }else{
    //Listar tudo
    $sql = 'SELECT * FROM dep';
  }
	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
	//dbh é a variavel que deve receber o pdo
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Resultado</title>
    <meta charset="utf-8" />
  </head>
  <body>
    <?php
      foreach($dbh->query($sql) as $linha){
        echo "Nome: {$linha['nome_dep']} <br />";
        echo "Local: {$linha['local_dep']} <br />";
        echo '<hr />';
      }
    ?>
  </body>
</html>
