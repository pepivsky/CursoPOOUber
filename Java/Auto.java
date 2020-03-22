package Java;

/**
 * Auto
 */
public class Auto {

    //Atributos de la clase
    Integer id;
    String license;
    Cuenta driver;
    Integer passenger;

    public  Auto(String license, Cuenta driver) {
        this.license = license;
        this.driver = driver;
        
    }

    void printDataCar(){
        System.out.println("License:"+license+" Driver:"+driver.name+" Passengers:"+passenger);
    }
}