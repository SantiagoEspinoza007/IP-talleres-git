print("****PROGRAMA PARA VERIFICAR SI UN NÚMERO ES PAR O IMPAR, "
    "POSITIVO O NEGATIVO, MULTIPLO DE 5 O UN NÚMERO PRIMO****")

#Ingreso de Datos
num = int(input("¿Cuál es el número a verificar?: "))

#Switch usando diccionarios
def switch():

    print("Del siguiente menú: ")
    print("1. Verificar si es par o impar")
    print("2. Verificar si es positivo o negativo")
    print("3. Verificar si es multiplo de 5")
    print("4. Verificar si es número primo")
    opc = int(input("Ingrese la opción a verificar: "))

    def case1():
        if num % 2 == 0:
            print("El número ",num," es par.")
        else:
            print("El número ",num," es impar.")
    
    def case2():
        if num > 0:
            print("El número ",num," es positivo.")
        else:
            print("El número ",num," es negativo.")
    
    def case3():
        if num % 5 == 0:
            print("El número ",num," es múltiplo de 5.")
        else:
            print("El número ",num," No es múltiplo de 5.")
    
    def case4():
        primo = 0
        for i in range(1, num+1):
            if num % i == 0:
                primo = primo + 1
        
        if primo == 2:
            print("El número ",num," es un número primo")
        else:
            print("El número ",num," NO es un número primo")

    def default():
        print("La opción escogida es erronea")

    #Mapeo de Diccionario
    dict = {
        1 : case1, 
        2 : case2, 
        3 : case3, 
        4 : case4
    }
    dict.get(opc, default)()

switch()