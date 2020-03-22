class Auto {

    //Método constructor que recibe dos párametros: licencia y un objeto de tipo Cuenta
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar(){
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
        
        

        
    } 
    
}