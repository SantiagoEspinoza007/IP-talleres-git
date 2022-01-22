print("\t***Programa para calcular el área de un polígono ***")

#Ingreso de Datos
nombre = print(input("Ingrese el nombre del usuario: "))

A = print(input("Ingrese la base del terreno (A): "))

B = print(input("Ingrese la base del terreno (B)"))

C = print(input("Ingrese la altura del rectángulo del terreno (C)"))

#Proceso
alTriag = A - C
areaT = (B * alTriag)/2
areaR = B * C
areaTotal = areaT + areaR

#Salida
print("El área del triángulo del terreno es: ", areaT, "\n")
print("El área del rectángulo del terreno es: ", areaR, "\n")
print("El área total del terreno es: ", areaTotal, "\n")
