print("\t---Contar los números terminados en 3 de un vector---")

def Buscar_Numeros(B):
    num = 0
    for i in range(10):
        if B[i] % 10 == 3:
            num += 1
    
    return num

#Declaración e Ingreso de los elementos del vector
A = []
print("Ingrese los elementos del vector")
for i in range(10):
    x = int(input("Ingrese el número: "))
    A.append(x)

num = Buscar_Numeros(A) #Se llama a la función
print("En el vector ingresado se han encontrado ",num," números terminados en 3.")
