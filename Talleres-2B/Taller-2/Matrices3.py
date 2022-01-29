print("\t---EJERCICIO 4-MATRICES---")
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

#Remplazar pares
print("->Matriz con elementos pares reemplazados")
for i in range(n):
    for j in range(n):
        if A[i][j] % 2 == 0:
            A[i][j] = 0

#Presentar la matriz A
print("\nLa matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

#Remplazar por 1 elementos en n-1
print("->Matriz cuando i o j sea n-1")
for i in range(n):
    for j in range(n):
        if (i == n-1) or (j == n-1):
            A[i][j] = 1

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
    for j in range(n):
        print("(",i,")(",j,")", end='  ')
    print("")