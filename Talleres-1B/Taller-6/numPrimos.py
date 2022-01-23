#Inicialización de variables
divisor = 0; i = 0; j = 0

#Proceso y Salida
n = int(input("¿Cuántos números va a ingresar?: "))

for i in range(1, n+1):
    num = int(input("Ingrese un número: "))

    #Verificar si un número es par o impar
    if num % 2 == 0:
        print("El número ",num," es PAR \n")
    else:
        print("El número ",num," es IMPAR \n")
    
    #Verificar si un número es primo
    j = 1
    while j<=num:
        if num % j == 0:
            divisor += 1
        
        j += 1
    if divisor == 2:
        print("El número ",num," es Primo \n")
    else:
        print("El número ",num," no es Primo \n")
    divisor = 0

