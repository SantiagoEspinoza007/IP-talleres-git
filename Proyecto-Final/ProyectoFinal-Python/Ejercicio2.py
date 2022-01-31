print("\t---VERIFICAR SI SON SEMEJANTES LOS PROMEDIOS DE LA DIAGONAL---")

print("Sus matrices A y B son de tipo 5 x 5")

#Ingreso de los elementos de la matriz A
A = []
for i in range(5):
    A.append([])
    for j in range(5):
        numa = int(input("A[{}], [{}]: ".format(i+1, j+1)))
        A[i].append(numa)

#Ingreso de los elementos de la matriz B
B = []
for i in range(5):
    B.append([])
    for j in range(5):
        numb = int(input("B[{}], [{}]: ".format(i+1, j+1)))
        B[i].append(numb)

#Switch usando diccionarios
def switch():
    print("¿Qué diagonal desea analizar?")
    diagonal = int(input("1. Diagonal Principal \n2. Diagonal Secundaria \n"))

    def principal():
        suma1 = 0; promedio1 = 0,0; suma2 = 0; promedio2 = 0,0
        for i in range(5):
            for j in range(5):
                if i == j:
                    suma1 = suma1 + A[i][j]
                    promedio1 = suma1 / 5
                    suma2 = suma2 + B[i][j]
                    promedio2 = suma2 / 5
        
        #Presentar la matriz A
        for fila in A:
            print("[", end="   ")
            for elemento in fila:
                print("{}".format(elemento), end="   ")
            print("]")
        print()

        #Presentar la matriz B
        for fila in B:
            print("[", end="   ")
            for elemento in fila:
                print("{:8f}".format(elemento), end="   ")
            print("]")
        print()

        print("El promedio de la diagonal principal de la matriz A es: ",promedio1)
        print("El promedio de la diagonal principal de la matriz B es: ",promedio2)
        if promedio1 == promedio2:
            print("\nLos promedios de la diagonal principal de ambas matrices son iguales")
        else:
            print("\nLos promedios de la diagonal principal de ambas matrices no son iguales")
        
    def secundaria():
        suma1 = 0; promedio1 = 0,0; suma2 = 0; promedio2 = 0,0
        for i in range(5):
            for j in range(5):
                if i+j == 4:
                    suma1 = suma1 + A[i][j]
                    promedio1 = suma1 / 5
                    suma2 = suma2 + B[i][j]
                    promedio2 = suma2 / 5

        #Presentar la matriz A
        for fila in A:
            print("[", end="   ")
            for elemento in fila:
                print("{}".format(elemento), end="   ")
            print("]")
        print()

        #Presentar la matriz B
        for fila in B:
            print("[", end="   ")
            for elemento in fila:
                print("{}".format(elemento), end="   ")
            print("]")
        print()

        print("El promedio de la diagonal secundaria de la matriz A es: ",promedio1)
        print("El promedio de la diagonal secundaria de la matriz B es: ",promedio2)
        if promedio1 == promedio2:
            print("\nLos promedios de la diagonal secundaria de ambas matrices son iguales")
        else:
            print("\nLos promedios de la diagonal secundaria de ambas matrices no son iguales")
        
    def default():
        print("La opción ingresada es erronea")
    
    #Mapeo de Diccionario
    dict = {
        1 : principal, 
        2 : secundaria, 
    }
    dict.get(diagonal, default)()

switch()
