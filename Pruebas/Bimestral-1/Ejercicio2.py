print("\t***PROGRAMA PARA MOSTRAR LOS MULTIPLOS DE 3 COMPRENDIDOS ENTRE DOS",
    "NÚMEROS INGRESADOS*** \n")

#Inicialización de Variables
num1 = 0; num2 = 0; i = 0; n = 0; multiplo = 0

#Ingreso de Datos
num1 = int(input("Ingrese el primer número entero: "))
num2 = int(input("Ingrese el segundo número entero: "))

#Proceso y Salida
if num1 > num2:
    n = num1
    i = num2
    print("Los multiplos de 3 comprendidos entre ",num2," y ",num1," son: \n")
    while i <= n:
        if i % 3 == 0:
            print(i)  
                
        i += 1
            
else:
    n = num2
    i = num1
    print("Los multiplos de 3 comprendidos entre ",num1," y ",num2 ," son: ")
    while i <= n:
        if i % 3 == 0:
            print(i)
    
        i += 1