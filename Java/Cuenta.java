package Java;

/**
 * Cuenta
 */
public class Cuenta {

    //Atributos del objeto Cuenta
    Integer id;
    String name;
    String document;
    String email;
    String password;

    //método constructor
    public  Cuenta(String name, String document) {
        this.name = name;
        this.document = document;
        
    }

}