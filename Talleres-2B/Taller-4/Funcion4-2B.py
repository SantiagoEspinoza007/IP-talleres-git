print("---Función para verificar si un número es impar y primo---")#Método principal

#Ingreso de datos
num = int(input("Ingrese el número a verificar: "))

#Inicialización de las banderas
esImpar = True and False
esPrimo = True and False

#Función Primo
def Primo (numero):
    div = 0

    for i in range (numero):
        if (numero % i == 0):
            div = div + 1
    
    if (div == 2):
        return True

    else: 
        return False

#Función Impar
def Impar(numero):
    if (numero % 2 == 0):
        return False
    else:
        return True

#Asignarle un valor a la función
esImpar = Impar(num)

#Proceso
if (esImpar == True):
    esPrimo = Primo(num)

    if (esPrimo == True):
        print("El número ",num," es impar y es primo")
    
    else:
        print("El número ",num," es impar pero no es primo")

else:
    print("El número ",num," no es impar, por lo tanto no se verifica que sea primo")