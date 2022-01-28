print("\t---Vector * Escalar---")

n = int(input("¿Cuantos elementos van a tener sus vectores?: "))

#Declaración del vector
A = []
B = []

#Ingreso del escalar
escalar = int(input("Ingrese el escalar: "))

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento: "))
    A.append(x)

#Multiplicación por el escalar
for i in range(n):
    B.append(A[i] * escalar)

#Presentar el vector B
print(B)
