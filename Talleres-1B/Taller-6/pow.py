#Inicialización de las Variables
base = 0; pot = 0; result= 1; i = 1

#Ingreso de Datos
base = int(input("Ingrese la base del número: "))
pot = int(input("Ingrese la potencia: "))

#Proceso y Salida
while i <= pot:
    result = result * base
    i += 1

print("La potencia de ", base, " es ", result)
