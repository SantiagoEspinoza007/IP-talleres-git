print("\t---ORDENAR UN VECTOR DE N ELEMENTOS---")

n = int(input("¿Cuantos elementos va a tener su vector?: "))

#Declaración del vector
A = []

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento: "))
    A.append(x)

#Presentar Vector
print("\n\t ---VECTOR ORIGINAL---")
print(A)

print("\n\t ---VECTOR ORDENADO DE FORMA ASCENDENTE---")
for i in range(n):
    for j in range(i+1,n):
        if A[i] > A[j]:
            aux = A[i]
            A[i] = A[j]
            A[j] = aux

print(A)

print("\n\t ---VECTOR ORDENADO DE FORMA DESCENDENTE---")
for i in range(n):
    for j in range(i+1,n):
        if A[i] < A[j]:
            aux = A[i]
            A[i] = A[j]
            A[j] = aux

print(A)