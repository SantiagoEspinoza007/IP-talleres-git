#Inicialización de las variables
i = 1; n = 0; num = 0; mayor = 0; menor = 0

#Ingrese los Datos
print("\n\t***Encontrar el número mayor de N números que ingrese el usuario*** \n")
n = int(input("Ingrese el límite de los números: "))

#Proceso
while i <= n:
    num = int(input("Ingrese un número: "))
    if num > mayor:
        mayor = num
    
    i += 1

print("El número mayor de los valores ingresados es: ", mayor)

print("\n\t***Encontrar el número menor de N números que ingrese el usuario***")

for i in range(1, n+1):
    num = int(input("Ingrese un número: "))
    
    if i == 1:
        menor = num
    print("**menor <-- ", menor)
    
    if num < menor:
        menor = num

print("El número menor de los valores ingresados es: ", menor)
