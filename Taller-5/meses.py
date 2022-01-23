print("\t***Identificador de Meses***\n")

#Switch usando Diccionarios
def switch():
    meses = int(input("Ingrese el número del mes a identificar: "))

    def ene():
        print("El número del mes ingresado: ", meses, " corresponde a enero")
    
    def feb():
        print("El número del mes ingresado: ", meses, " corresponde a febrero")
    
    def mar():
        print("El número del mes ingresado: ", meses, " corresponde a marzo")
    
    def abr():
        print("El número del mes ingresado: ", meses, " corresponde a abril")
    
    def may():
        print("El número del mes ingresado: ", meses, " corresponde a mayo")
    
    def jun():
        print("El número del mes ingresado: ", meses, " corresponde a junio")

    def jul():
        print("El número del mes ingresado: ", meses, " corresponde a julio")

    def ago():
        print("El número del mes ingresado: ", meses, " corresponde a agosto")

    def sep():
        print("El número del mes ingresado: ", meses, " corresponde a septiembre")

    def oct():
        print("El número del mes ingresado: ", meses, " corresponde a octube")

    def nov():
        print("El número del mes ingresado: ", meses, " corresponde a noviembre")

    def dic():
        print("El número del mes ingresado: ", meses, " corresponde a diciembre")
    
    def default():
        print("El número de mes ingresado es incorrecto")
    
    #Mapeo de Diccionario
    dict = {
        1 : ene,
        2 : feb,
        3 : mar,
        4 : abr,
        5 : may,
        6 : jun,
        7 : jul,
        8 : ago,
        9 : sep,
        10 : oct,
        11 : nov,
        12 : dic
    }
    dict.get(meses, default)()
    
switch()