print("\t***Calculadora Básica***")

#Ingreso de Datos
num1 = int(input("Ingrese el valor del primer número: "))
num2 = int(input("Ingrese el valor del segundo número: "))

#Switch usando Diccionarios
def switch():

    print("\nSeleccione la operación del siguiente menú")
    print("1. Suma \n2. Resta \n3. Multiplicación \n4. División")
    opc = int(input("\nIngrese una opción: "))

    def suma():
        total = num1 + num2
        print("El resultado es: ", total)

    def resta():
        total = num1 - num2
        print("El resultado es: ", total)

    def mult():
        total = num1 * num2
        print("El resultado es: ", total)

    def divi(): 
        total = num1 / num2
        print("El resultado es: ", total)

    def default():
        print("La opción ingresada es erronea")

    #Mapeo de Diccionario
    dict = {
        1 : suma, 
        2 : resta, 
        3 : mult, 
        4 : divi
    }
    dict.get(opc, default)()

switch()