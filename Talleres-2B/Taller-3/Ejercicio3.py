print("\t----SUMA DE DOS MATRICES A Y B EN UNA MATRIZ C----")

n = int(input("Ingrese el tamaño de las matrices a ingresar: "))

#Ingreso de datos en las matrices
A = []

print("\nIngresar los elementos de la matriz A")
for i in range (n):
    A.append([])
    for j in range (n):
        x = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(x)

B = []
print("\nIngresar los elementos de la matriz B")
for i in range (n):
    B.append([])
    for j in range (n):
        x = int(input("B["+str(i)+"]["+str(j)+"]: "))
        B[i].append(x)

print("\nLa matriz A es: ")
for i in range (n):
    for j in range (n):
        print(A[i][j], end="   ")
    print("")

print("\nLa matriz B es: ")
for i in range (n):
    for j in range (n):
        print(B[i][j], end="   ")
    print("")

# Suma de matrices
C = []

for i in range (n):
    C.append([])
    for j in range (n):
        x = A[i][j] + B[i][j]
        C[i].append(x)

print("\nLa matriz C es: ")
for i in range (0, n):
    for j in range (0, n):
        print(C[i][j], end="   ")
    print("")