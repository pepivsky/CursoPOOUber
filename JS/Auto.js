function Auto(license, driver) {

    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;

    Auto.prototype.printDataCar = function(){
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
        
        

        
    }
    
}