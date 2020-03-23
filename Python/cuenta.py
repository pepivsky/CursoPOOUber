class Cuenta:
    # Astributos de las clase Cuenta
    id          = int
    name        = str
    document    = str
    email       = str
    password    = str

    # Método constructor
    def __init__(self, name, document):
        self.name     = name
        self.document = document