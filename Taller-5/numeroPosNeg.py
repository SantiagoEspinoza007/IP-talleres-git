print("\t***Verificar si un número es Positivo o Negativo")

#Ingreso de Datos
num1 = int(input("Ingrese el número a verificar: "))

#Proceso y Salida
if num1 == 0:
    print("El número ingresado: ", num1, " es neutro")
else:
    if num1 > 0:
        print("El número ingresado: ", num1, " es positivo")
    else:
        print("El número ingresado: ", num1, " es negativo")