print("\tProcedimiento para verificar si un número es positivo o negativo") #Método principal

#Ingreso de datos
num = int(input("Ingrese el número a verificar: "))

#Inicialización de la bandera
bandera = True and False

#Función
def funNegPos (numero):
    if (numero > 0):
        return True
    else:
        return False

#Asignar el valor que devuelve la función
band = funNegPos(num)

if (band == True):
    print("El número ",num," es positivo")
else:
    print("El número ",num," es negativo")

print("---FIN DE LA FUNCIÓN 1---\n")

# Comprobar directamente con el llamado a la función
if (funNegPos(num) == True):
    print("El número ",num," es positivo")
else:
    print("El número ",num," es negativo")

print("---FIN DE LA FUNCIÓN 2---")