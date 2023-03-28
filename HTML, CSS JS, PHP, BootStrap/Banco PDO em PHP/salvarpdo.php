<?php 
 
$login = $_POST['login'];
$senha = MD5($_POST['senha']);


$connect = mysqli_connect('localhost','root','');

try {
  $pdo = new PDO('mysql:host=localhost;dbname=test','root', '');
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

  $stmt = $pdo->prepare('INSERT INTO usuario (login,senha) VALUES(:login,:senha)');
  $stmt->execute(array(
    ':login' => $login,
	':senha' => $senha

  ));

  echo $stmt->rowCount();
} catch(PDOException $e) {
  echo 'Error: ' . $e->getMessage();
}

?>