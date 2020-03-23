<?php
require_once ('Auto.php');
require_once ('Cuenta.php');
echo 'Hola mundo';

$car= new Car('AMQ123', new Account('Michelle Arias', 'AMQ123'));
$car->printDataCar();


?>