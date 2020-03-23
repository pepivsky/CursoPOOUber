<?php
require_once ('Cuenta.php');
class Auto{
    // Atributos de la clase
    public $id;
    public $license;
    public $driver;
    public $passenger;

    //Método constructor
    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        // System.out.println("License:"+license+" Driver:"+driver.name+" Passengers:"+passenger);
        echo 'License:'+$license+' Driver:'+$driver.name+' Passengers:'+$passenger
    }


}
?>
