print("\t****SERIE NUMÉRICA****")
#Inicialización de las variables
num = 1; numc = 0; denom = 7; pot = 2; suma = 0; sumando = 0; mult3 = 3

#Ingreso de Datos
n = int(input("Ingrese el límite de la serie: "))

#Proceso y Salida
numc = num 
for i in range(1, n+1):
    print(numc,"^",pot,"/",denom)

    if i % 2 == 0:
        numc = 1
        num = 1
    else:
        numc = 2
        num = 2
    
    pot += 2
    for j in range(2, pot+1):
        num = num * 2
    
    if i == 1:
        denom += 3
    else:
        mult3 += 3
        denom = denom + mult3
    
    sumando = num/denom
    suma = suma + sumando

print("La suma total de la serie es: ",suma)