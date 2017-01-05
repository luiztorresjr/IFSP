<?php
  include('banco.php');
  $nome  = $_GET['nome'];
  $local = $_GET['local'];
  

    $sql = "SELECT * FROM dep WHERE nome_dep = ? AND local_dep = ?";     

    try{
      $stmt = $dbh->prepare($sql);

      $param[0]=$nome;
      $param[1]=$local;

      $stmt->execute($param);
  }catch(PDOException $e){
    echo $e->getMessage();
  }
  
  
 
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Resultado</title>
    <meta charset="utf-8" />
     <style>    
      h3{
        width: 10px; 
        font-family: "century gothic";
      }
    </style>
  </head>
  <body>
    <?php
      foreach($stmt->fetchAll() as $linha){
        echo "<h3><strong>Departamentos</strong></h3>";
        echo "Codigo: {$linha['n_dep']} <br />";
        echo "Nome: {$linha['nome_dep']} <br />";
        echo "Local: {$linha['local_dep']} <br />";
        echo '<hr />';
      }
    ?>
  </body>
</html>