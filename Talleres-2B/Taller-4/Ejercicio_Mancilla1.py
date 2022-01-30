print("\t---Programa para calcular el cuadrado de los números ingresados en un vector---")

#Ingreso de datos
n = int(input("¿Cuántos números va a ingresar en el vector?: "))

#Declaración e Ingreso de Datos en el vector
v = []

for i in range(n):
    x = int(input("Ingrese el elemento: "))
    v.append(x)

def Cuadrado_Suc(n):
    r=0; j=n

    while j > 0:
        r += n
        j -= 1

    return r

c = []
for i in range(n):
    x = Cuadrado_Suc(v[i])
    c.append(x)

print(c)
for i in range(n):
    print("El número contenido en la posición V[",i,"] tiene como cuadrado ",c[i])