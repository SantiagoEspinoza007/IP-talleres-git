#Inicialización de variables
num = 1; den = 2; term = 0; sum = 0; i = 1; n = 0

#Entrada de Datos
n = int(input("Ingrese el límite de la sucesión: "))

#Proceso y Salida
term = num / den
sum = sum + term
        
while i <= n:
    term = num / den
    print("El término ",i," es ",num,"/",den)
    sum = sum + term
    num = num + 2
    den = den + 3
    i = i + 1
    
print("La suma es: ", sum)
