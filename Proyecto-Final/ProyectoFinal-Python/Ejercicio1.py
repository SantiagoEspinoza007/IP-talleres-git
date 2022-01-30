print("\t---PRESENTAR LOS NUMEROS COMPRENDIDOS ENTRE 1 Y EL NÚMERO INGRESADO---")

#Se pregunta el límite del vector
n = int(input("¿Cuántos números va a ingresar?: "))

#Declaración e Ingreso de datos en el vector
A = []
print("Ingrese los elementos del vector")

for i in range(0,n):
    x = int(input("Ingrese un entero: "))
    A.append(x)

for i in range(0,n):
    print("Los números comprendidos entre 1 y ",A[i]," son: ")
    for j in range(1,A[i]+1):
        print(j)
    print("")