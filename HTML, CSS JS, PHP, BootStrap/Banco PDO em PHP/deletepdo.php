<?php 
 
$login = $_POST['login'];




try {
 $pdo = new PDO('mysql:host=localhost;dbname=test', 'root', '');
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

  $stmt = $pdo->prepare('DELETE FROM usuario WHERE login = :login');
  $stmt->bindParam(':login', $login);
  $stmt->execute();

  echo $stmt->rowCount();
} catch(PDOException $e) {
  echo 'Error: ' . $e->getMessage();
}

?>