print("\t---ENCONTRAR EL NÚMERO MAYOR DENTRO DE UN VECTOR---")

#Ingreso del límite
n = int(input("¿Cuantos elementos va a tener su vector?: "))

#Declaración del vector
A = []

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento: "))
    A.append(x)

#Proceso
mayor = A[0]

for i in range(n):
    if A[i] > mayor:
        mayor = A[i]

print("El número mayor del vector es: ",mayor)
