print("\t---Chequeo de disponibilidad de anaqueles de góndolas---")

rd = 0

Disp = []

k = int(input("Ingrese el número de góndolas: "))
n = int(input("Ingrese el número de anaqueles: "))

for i in range (0, k):
    Disp.append([])
    for j in range (0, n):
        valor = int(input("Disp[",str(i),"][",str(j),"]: "))
        Disp[i].append(valor)

# Se hace el chequeo de la disponibilidad
# Del anaquel q en la góndola g

q = int(input("Ingrese el anaquel (q) a evaluar: "))
g = int(input("Ingrese la góndola (g) que necesita comprobar: "))

# Crear la función y usarla en el proces

def FunDisp (Disp, g, q):
    
    if (Disp[g][q] == 0):
        return 0

    else:
        return 1        

rd = FunDisp(Disp, g, q)

if (rd == 0):
    print("El anaquel ",q," en la góndola ",g," está disponible")
else:
    print("El anaquel ",q," en la góndola ",g," NO está disponible")