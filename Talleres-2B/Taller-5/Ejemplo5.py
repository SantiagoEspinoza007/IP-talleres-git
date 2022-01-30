print("---ERROR CON EXCEPCION---")
#Proceso
try:
    valor1 = int(input("Ingrese el valor 1: "))
    valor2 = int(input("Ingrese el valor 2: "))

    if valor1<0 or valor2<0:
        raise Exception("ERROR: No se permite ingresar número negativos")
    
    total = valor1/valor2

    print("El resultado es: ",total)

except Exception as ex:
    print("Lo sentimos hay un error de tipo: ",ex)