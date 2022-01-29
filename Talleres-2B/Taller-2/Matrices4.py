
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

#Proceso
for i in range(n):
    menor = A[i][0]
    for j in range(n):
        if A[i][j] < menor:
            menor = A[i][j]
            k = i
            l = j
    print("El elemento menor de la fila ",i," es "
            ,menor," y está en A[",k,"][",l,"]")
    k = 0
    j = 0