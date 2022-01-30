print("\t----REMPLAZAR ELEMENTOS SOBRE LA DIAGONAL PRINCIPAL DE UNA MATRIZ----")

n = int(input("Ingrese el tamaño de la matriz: "))

#Declarar la matriz
A = []

#Ingreso de datos en la matriz
print("\nIngresar los elementos de la matriz A: ")
for i in range (n):
    A.append([])
    for j in range (n):
        x = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(x)

print("\nLa matriz Original es: ")
for i in range (n):
    for j in range (n):
        print(A[i][j], end="   ")
    print("")

#Proceso para remplazar por 0 
for i in range (n):
    for j in range (n):
        if (j>i):
            A[i][j] = 0

print("\nLa matriz remplazada con ceros es: ")
for i in range (n):
    for j in range (n):
        print(A[i][j], end="   ")
    print("")
