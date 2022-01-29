m=int(input("Ingrese el tamaño de la matriz cuadrada: "))

#Recorrer la matriz e ingresar los elementos de la matriz
A = []
print("\nIngresar los elementos de la matriz: ")
for i in range(m):
    A.append([])
    for j in range(m):
        numa = int(input("A[{}], [{}]: ".format(i+1, j+1)))
        A[i].append(numa)

#Determinar si la matriz es simetrica o no
bandera = 0
for i in range(m):
    for j in range(m):
        if  A[i][j] != A[j][i]:
            bandera = 1

if bandera == 1:
    print("La matriz no es simetrica")
else:
    if bandera == 0:
        print("La matriz es simétrica")