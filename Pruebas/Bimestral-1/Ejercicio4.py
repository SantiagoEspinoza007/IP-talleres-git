import string


print("\t***CAJA FUERTE***")

#Inicialización de las Variables
aciertos = 1; contraseña = 0; intentos = 4

#Proceso
while  aciertos == 1 and intentos > 0: 
    contraseña = int(input("Ingrese la contraseña: "))
    if contraseña == 9876:
        aciertos = 0
    else:
        if aciertos == 1:
            print("Lo siento, esa no es la combinación")
    
    intentos -= 1

if aciertos == 0:
    print("La caja fuerte se ha abierto satisfactoriamente")
else:
    print("La caja fuerte ha sido bloqueada")

    