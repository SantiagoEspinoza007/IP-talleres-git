#Declaración e Inicialización de las Variables
i = 1; suma = 0

#Proceso
print("****SUMA MULTIPLOS DE 3 Y 5****")
while(i<=999):
    if ((i%3==0)or(i%5==0)):
        suma = suma + i       
    i = i + 1

print("Total: ", suma)