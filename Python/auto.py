from cuenta import Cuenta

class Auto:

    id          = int
    license     = str
    driver      = Cuenta("","")
    passenger   = int

    #Método constructor
    def __init__(self, license, driver):
        self.license = license
        self.driver  = driver