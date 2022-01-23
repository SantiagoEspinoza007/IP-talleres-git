#Generar la serie fibonacci

#Declaración e Inicialización de las Variables

i = 3; total = 0; n = 0; n1 = 0; n2 = 1

#Ingreso del límite de la serie
print("****SERIE FIBONACCI****")
n = int(input("Ingrese el número de terminos:"))

#Proceso y Salida
print(n1,"\n",n2)
while(i<=n):
    total = n1 + n2
    n1 = n2
    n2 = total
    print(total)
    i = i + 1