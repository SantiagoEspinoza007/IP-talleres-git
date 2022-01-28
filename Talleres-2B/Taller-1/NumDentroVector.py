print("\t---CONTAR Y BUSCAR UN NÚMERO DENTRO DE UN VECTOR---")

n = int(input("¿Cuantos elementos va a tener su vector?: "))

#Declaración del vector
A = []

#Ingreso de los elementos del vector
for i in range(n):
    x = int(input("Ingrese el elemento: "))
    A.append(x)

#Ingreso del número
num = int(input("Ingrese el número a verificar: "))

#proceso
cont = 0
for i in range(n):
    if num == A[i]:
        cont = cont + 1
        print("El número ",num," se encuentra en la posición: A[",i,"]")
print("\nEl número ",num," se repetio ",cont," veces")