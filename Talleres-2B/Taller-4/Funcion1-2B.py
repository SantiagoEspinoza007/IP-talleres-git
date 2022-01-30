print("\t---Procedimiento para verificar si un número es par o impar---") #Método principal

#Ingresar los datos
num = int(input("Ingrese el número a verificar: "))

#Verificar si es par o impar
def ParImpar(numero):
    if (numero % 2 == 0):
        print("El número ",numero," es par")
    
    else:
        print("El número ",numero," es impar")

ParImpar(num)
print("\t**Fin del procedimiento 1**\n")

#Verificar si es positivo o negativo
def NegPos (numero):
    if (numero > 0):
       print("El número ",numero," es positivo")
    else:
        print("El número ",numero," es negativo")

NegPos(num)
print("\t**Fin del procedimiento 2**")