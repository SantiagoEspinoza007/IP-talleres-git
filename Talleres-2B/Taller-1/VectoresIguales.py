print("\t---DETERMINAR SI DOS VECTORES SON IGUALES EN CONTENIDO Y POSICIÓN---")

n = 5

#Declaración de los vectores
A = []
B = []

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento A: "))
    A.append(x)

for i in range(n):
    y = int(input("Ingrese el elemento B: "))
    B.append(y)

#Proceso
ba = 0
for i in range(n):
    if A[i] != B[i]:
        ba = 1

if ba == 1:
    print("Los vectores A y B no son iguales")
else:
    if ba == 0:
        print("Los vectores A y B son iguales")