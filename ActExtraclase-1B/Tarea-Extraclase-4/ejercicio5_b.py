#22. Describa la salida de los siguientes ciclos:
# b)
#Declaración e Inicialización de las Variables
i = 3; j = i; k = i
        
#Proceso y Salida
while(i>=1):
    while (j==i):
        while (k==j):
            print(i, " ", j, " ", k)
            k = k - 1
        j = j + 1
    i = i - 1
