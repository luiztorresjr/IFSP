<?php
  $n_emp    = $_POST['n_emp'];
  $nome_emp = $_POST['nome_emp'];
  $cargo    = $_POST['cargo'];
  $chefe    = $_POST['chefe'];
  $data_adm = $_POST['data_adm'];
  $sal      = $_POST['sal'];
  $com      = $_POST['com'];
  $n_dep    = $_POST['n_dep'];

  	//criar um variável que receberá o pdo com o as informações de conexão do banco de dados
	//dbh é a variavel que deve receber o pdo
  
  if($chefe == 0){
    $chefe = 'NULL';
  }
  
  if(empty($com)){
    $com = 'NULL';
  }

  $sql = "INSERT INTO emp 
          VALUES ($n_emp, '$nome_emp', '$cargo', $chefe, '$data_adm', $sal, $com, $n_dep)";
          
  $resultado = $dbh->exec($sql);

  //$retorno = $dbh->errorInfo();

?>
<!DOCTYPE html>
<html>
  <head>
    <title>Página 1</title>
    <meta charset="utf-8" />
  </head>
  <body>
    <?php
      if($resultado){
        echo 'Inserido com sucesso!';
      }else{
        echo 'Erro!';
      }
    ?>
  </body>
</html>
