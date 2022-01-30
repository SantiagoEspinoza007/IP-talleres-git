print("---Función para verificar si un número es impar y un procedimiento para verificar si es primo---") # *Método principal**

#Ingreso de datos
num = int(input("Ingrese el número a verificar: "))

#Inicialización de la bandera
esImpar = True and False

#Función Impar
def Impar(numero):
    if (numero % 2 == 0):
        return False
    else:
        return True

esImpar = Impar(num)

#Procedimiento Primo
def Primo(numero):
    div = 0
    
    for i in range (numero):
        if (numero % i == 0):
            div = div + 1
    
    if (div == 2):
        print("El número ",numero," es impar y primo")
    else:
        print("El número ",numero," es impar y no es primo")

if (esImpar == True):
    Primo(num)
else:
    print("El número no es impar, por lo cual no se verifica si es primo")