print("\t---CLASIFICAR UN VECTOR SEGÚN SUS NÚMEROS SEAN PARES O IMPARES---")

n = int(input("¿Cuantos elementos va a tener su vector?: "))

#Declaración del vector
A = []

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento: "))
    A.append(x)

#Proceso
par = 0
impar = 0
for i in range(n):
    if A[i] % 2 == 0:
        par = par + 1
    else:
        impar = impar + 1

#Declaración del vector B par y vector C impar
B = []
C = []

#Proceso
par = 0
impar = 0
for i in range(n):
    if A[i] % 2 == 0:
        B.append(A[i])
        par = par + 1
    else:
        C.append(A[i])
        impar = impar + 1

#Presentar el vector los vectores
print("\n\t---VECTOR ORIGINAL---")
print(A)

print("\n\t---VECTOR CORRESPONDIENTES A NUMEROS PARES---")
print(B)

print("\n\t---VECTOR CORRESPONDIENTES A NUMEROS IMPARES---")
print(C)