#Tamaño del vector
import string


n = int(input("Ingrese el número de notas a promediar: "))

#Declaración de los vectores
NOTAS = []
Nombres = []

#Ingreso de las notas
print("Ingrese los elementos del vector")
for i in range(0,n):
    y = input("Ingrese el nombre: ")
    Nombres.append(y)
    
    x = float(input("Ingrese la nota de: "))
    NOTAS.append(x)

#Calcular la suma de las notas
suma = 0
for i in range(n):
    suma += NOTAS[i]

#Promedio de las notas ingresadas 
promed = suma / (n)

#Presentar los elementos del vector
for i in range(n):
    print("Notas [",i,"] = ",NOTAS[i])

print("El promedio de las notas es: ",promed)

#Obtener la nota más alta
mayor = NOTAS[0]
for i in range(n):
    if NOTAS[i]>mayor:
        mayor = NOTAS[i]
    print("---Nota Mayor = " ,mayor)

    for i in range(n):
        if i % 2 != 0:
            print("Notas [",i,"] = ",NOTAS[i])

    print("NOTAS Y NOMBRES DE ESTUDIANTES")
    for i in range(n):
        print(Nombres[i]," tiene una nota de ",NOTAS[i])
