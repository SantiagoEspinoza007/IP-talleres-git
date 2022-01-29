print("\t---EJERCICIOS CON MATRICES---")

n=int(input("Ingrese el número de filas: "))
m=int(input("Ingrese el número de columnas: "))

#Ingreso de los elementos de la matriz A
A = []
for i in range(n):
    A.append([])
    for j in range(m):
        numa = int(input("A[{}], [{}]: ".format(i+1, j+1)))
        A[i].append(numa)

#Presentar la matriz A
print("\nLa matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

print("La Matriz A según su posición es: ")
for i in range(n):
    for j in range(m):
        print("(",i,")(",j,")", end='  ')
    print("")

B = []
suma = 0
for i in range(n):
    for j in range(m):
        suma = suma + A[i][j]
    B.append(suma)
    suma=0

print("\nEl vector B (sumatoria de filas) es: ")
print(B)