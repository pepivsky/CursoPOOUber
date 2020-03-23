from auto import Auto
from cuenta import Cuenta

if __name__  == "__main__":
    print("Hola mundo")

    auto = Auto("HDFR12", Cuenta("Maria Gutierrez", "ADNG145"))
    #auto.license = 
    #auto.driver = "Andres Herrera"
    auto.passenger = 3;
    print(vars(auto))
    print(vars(auto.driver))