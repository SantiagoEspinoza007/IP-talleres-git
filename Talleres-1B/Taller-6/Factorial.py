#Inicialización de Variables
i = 1; j = 1; num = 0; fact = 1; mult = 1; total = 1

#Ingreso de Datos
num = int(input("¿De qué numero desea obtener el factorial?"))

#Proceso
for i in range(1, num+1):
    print(fact, "! = ")
    for j in range (1, i):
        print(" (", j, ") ")
    print(" (", mult, ") ")
    fact += 1
    mult = mult + 1
    total = total * i

print(num, "! = ", total) 
