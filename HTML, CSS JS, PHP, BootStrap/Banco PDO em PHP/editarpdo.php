<?php 
 
$login = $_POST['login'];
$senha = MD5($_POST['senha']);



try {
  $pdo = new PDO('mysql:host=localhost;dbname=test', 'root', '');
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

  $stmt = $pdo->prepare('UPDATE usuario SET senha = :senha WHERE login = :login');
  $stmt->execute(array(
    ':login'   => $login,
    ':senha' => $senha
  ));

  echo $stmt->rowCount();
} catch(PDOException $e) {
  echo 'Error: ' . $e->getMessage();
}

?>