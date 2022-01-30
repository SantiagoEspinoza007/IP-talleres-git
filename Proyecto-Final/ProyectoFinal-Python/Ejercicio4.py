print("\t---Intercambiar de posición 2 filas de la matriz---")

#función para intercambiar dos filas
def intercambiar(A, m, n, f1, f2):
    for i in range(m):
        for j in range(n):
            if i == f1:
                aux = A[i][j]
                A[i][j] = A[f2][j]
                A[f2][j] = aux
                aux = 0
    
    return A

#Determinar el tamaño de la matriz
m = int(input("¿Cuántas filas va a tener la matriz a ingresar?: "))
n = int(input("\n¿Cuántas columnas va a tener la matriz a ingresar?: "))

#Declaración e Ingreso de los datos de la matriz
print("\nIngresar los elementos de la matriz A: ")
A = []
for i in range(m):
    A.append([])
    for j in range(n):
        num = int(input("A [{}], [{}]: ".format(i+1, j+1)))
        A[i].append(num)

#Determinar las filas a Intercambiar
f1 = int(input("\nIngrese el valor de la primera fila a intercambiar: "))
f2 = int(input("\nIngrese el valor de la primera fila a intercambiar: "))

#Presentar la matriz original
print("\nLa matriz original es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()

A = intercambiar(A, m, n, f1, f2) #Se llama a la función
#Presentar la matriz A
print("La matriz A es: ")
for fila in A:
    print("[", end="   ")
    for elemento in fila:
        print("{}".format(elemento), end="   ")
    print("]")
print()