print("\t---Mayor Elemento, Transpuesta y Elementos Impares de una Matriz---")

n = int(input("Ingrese el número de filas: "))
m = int(input("Ingrese el número de columnas: "))
print("Su matriz corresponde a una matriz de ",m," X ",n)
k = 50

# Declarar las matrices
A = []
B = []
C = []

# Función leer_Matriz
def leer_Matriz(fila, columna, M):
    for i in range (fila):
        M.append([])
        for j in range (columna):
            x = int(input("Digite el elemento de la posición [",str(i),"][",str(j),"] : "))
            M[i].append(x)

# Función mayor
def mayor(fila, columna, M):
    May = 0
    
    for i in range (fila):
        for j in range (columna):
            if (M[i][j] > May):
                May = M[i][j]

    print("El elemento mayor de la matriz es: ",May,"\n")

# Función transpuesta
def transpuesta(fila, columna, M1, M2):
    
    for i in range (fila):
        M2.append([])
        for j in range (columna):
            x = M1[j][i]
            M2[i].append(x)
    escribir_Matriz(fila, columna, M2)

# Función impar
def impar (fila, columna, M, V, tam):
    tam = 0
    
    for i in range (fila):
        for j in range (columna):
            if (M[i][j] % 2 != 0):
                v = M[i][j]
                V.append(v)
                tam += 1
        
    print("Tam ← ",tam)
    return (tam-1)

# Función escribir_Matriz
def escribir_Matriz(fila, columna, M):
    for i in range (fila):
        for j in range (columna):
            print(M[i][j], end="   ")
        print(" ")

# Función escribir_Vector
def escribir_Vector(tam, v):

    for i in range (tam+1):
        print("El elemento en la posición ",str(i)," es: ",str(v[i]))

#Aplicarles valores a la funciones desarrolladas
leer_Matriz(n, m, A)
print("-> Matriz Original")
escribir_Matriz(n, m, A)
mayor (n, m, A)
print("-> Matriz Transpuesta") 
transpuesta (n, m, A, B)

#escribir_matriz
k = impar(n, m, A, C, k)

if (k > 0):
    escribir_Vector(k, C)
else:
    print("La matriz no tiene números impares")