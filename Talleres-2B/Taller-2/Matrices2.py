print("\t---OPERACIONES SOBRE MATRICES CUADRADAS---")

n=int(input("Ingrese el tamaño de la matriz cuadrada: "))

#Recorrer la matriz e ingresar los elementos de la matriz
A = []
print("\nIngresar los elementos de la matriz: ")
for i in range(n):
    A.append([])
    for j in range(n):
        numa = int(input("A[{}], [{}]: ".format(i+1, j+1)))
        A[i].append(numa)

#Presentar la matriz A
print("\nLa matriz Original es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

print("->Cambiar por 0 la diagonal principal")
for i in range(n):
    for j in range(n):
        if i == j:
            A[i][j] = 0

#Presentar la matriz A
print("\nLa matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

print("->Cambiar por 1 la diagonal secundaria")
for i in range(n):
    for j in range(n):
        if i+j == n-1:
            A[i][j] = 1

#Presentar la matriz A
print("\nLa matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

print("->Cambiar por 99 las esquinas de la matriz")
A[0][0]=99
A[0][n-1]=99
A[n-1][0]=99
A[n-1][n-1]=99

#Presentar la matriz A
print("\nLa matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()