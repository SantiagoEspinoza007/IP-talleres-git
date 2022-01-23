print("\t***Identificador del mayor de 3 números***")

#Ingreso de Datos
num1 = int(input("Ingrese el valor del primer número: "))
num2 = int(input("Ingrese el valor del segundo número: "))
num3 = int(input("Ingrese el valor del tercer número: "))

#Proceso y Salida
if (num1 > num2) and (num1 > num3):
    total = num1
    print("El mayor de los 3 números es: ", total)
else:
    if (num2 > num1) and (num2 > num3):
        total = num2
        print("El mayor de los 3 números es: ", total)
    else:
        if (num3 > num1) and (num3 > num2):
            total = num3
            print("El mayor de los 3 números es: ", total)
