package Java;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo :)");
        
        //Instanciando el objeto y pásandole los datos al método constructor de la clase Auto
        Auto auto = new Auto("HFG124", new Cuenta("Pepe Paredes", "AND123"));
        //auto.license = "HFG124";
        //auto.driver = "Pepe paredes";
        auto.passenger = 4;

        auto.printDataCar();

    }
}