<?php
  $n1 = $_GET['n1'];
  $n2 = $_GET['n2'];
?>
<!DOCTYPE html>
<html>
  <head>
    <title>Página 1</title>
    <meta charset="utf-8" />
  </head>
  <body>
    <?php
      for($i = $n1; $i <= $n2; $i++){
        if($i%2 == 0)
          echo "$i <br />";
      }
    ?>
  </body>
</html>