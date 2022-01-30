print("\t---MATRIZ TRANSPUESTA---")
#Tamaño de la matriz
n=int(input("Ingrese el número de filas: "))
m=int(input("Ingrese el número de columnas: "))

#Declaración e Ingreso de datos de la matriz
A = []

print("\nIngresar los elementos de la matriz: ")
for i in range(n):
    A.append([])
    for j in range(m):
        numa = int(input("A[",str(i),"][",str(j),"]: "))
        A[i].append(numa)

#Presentar la matriz A
print("\nLa matriz Original es: ")
for i in range(n):
    print("[", end="   ")
    for j in range(m):
        print(A[i][j], end="   ")
    print("]")
print()

#Arreglo para la matriz
print("\nLa matriz Transpuesta es: ")
for j in range(m):
    print("[", end="   ")
    for i in range(n):
        print(A[i][j], end="   ")
    print("]")
print()
