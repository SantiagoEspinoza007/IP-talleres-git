print("---ERROR ENTRADA DE DATOS---")
#Proceso
try:
    valor1 = int(input("Ingrese el valor 1: "))
    valor2 = int(input("Ingrese el valor 2: "))

    total = valor1/valor2

    print("El resultado es: ",total)

except ValueError:
    print("Existe un error en la entrada de datos")
