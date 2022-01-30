print("---ERROR CON 2 EXCEPCIONES---")
#Proceso
try:
    valor1 = int(input("Ingrese el valor 1: "))
    valor2 = int(input("Ingrese el valor 2: "))

    total = valor1/valor2

    print("El resultado es: ",total)

except ZeroDivisionError as ex:
    print("Lo sentimos, hay un error de tipo: ",ex)

except ValueError:
    print("Existe un error en la entrada de datos")