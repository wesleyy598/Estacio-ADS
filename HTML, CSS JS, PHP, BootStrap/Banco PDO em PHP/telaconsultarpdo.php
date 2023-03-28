<?php

$pdo = new PDO('mysql:host=localhost;dbname=test', 'root', '');
  $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
$consulta = $pdo->query("SELECT login FROM usuario;");


while ($linha = $consulta->fetch(PDO::FETCH_ASSOC)) {
    echo "login: {$linha['login']} <br />";
}
?>