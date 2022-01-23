#Declaración e Inicialización de las Variables

suma = 0; digi = 1
        
#Ingreso del límite
num = int(input("Ingrese el número entero a analizar: "))
        
#Proceso
numc = num
if (numc < 0):
    numc = -numc
        
if (numc == 0):
    suma = 0
    digi = 1
        
else :
    while (numc>0):
        
        suma = suma + (numc % 10)
        digi = digi + 1
        numc = numc / 10

print(num, " tiene ", digi, " dígitos y la suma de los dígitos de ", num, " es: ", suma)
