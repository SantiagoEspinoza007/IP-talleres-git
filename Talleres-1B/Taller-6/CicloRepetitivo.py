#Inicialización de Variables
i = 1
sum = 0

#Ingreso de Datos
n = int(input("Ingrese el límite del ciclo: "))

#Proceso
while i<=n:
    sum += i
    print(i)
    i = i + 1
print("i es: ", i)

print("La suma es: ", sum, "\n")

i = n
sum = 0

while i >= 1:
    print("suma: ", sum)
    sum = sum + i
    print(i)
    i = i - 1
        
print("i es: ", i)
        
print("La suma es: ", sum)
