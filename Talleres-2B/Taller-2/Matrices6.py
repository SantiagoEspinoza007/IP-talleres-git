#Selección de personal

m = int(input("Ingrese el número de trabajadores: "))
k = int(input("Ingrese el número de criterios a evaluar: "))
n = int(input("Número de aspirantes a seleccionar: "))

#Declara e Ingresar los datos del vector codigo
codigo = []
for i in range(m):
    x = input("Ingrese el nombre: ")
    codigo.append(x)

#Declarar e Ingresar datos en la matriz
C = []
for i in range(m):
    print("\nCalificación criterios de ",codigo[i])
    C.append([])
    for j in range(k):
        print("Ingrese la calificación del criterio ",j," de ",codigo[i])
        num = float(input("-> "))
        C[i].append(num)
        if C[i][j] >10 or C[i][j]<0:
            print("\t****Ingrese calificaciones dentro del rango de 0 a 10 puntos****")
            print("\t***EL PROCESO HA FINALIZADO***")
            print("\t****REINICIE EL PROGRAMA***")
            print("Los datos se obtendrán hasta antes de error detectado")
            j = k
            i = m

#Declarar el arreglo de media
print("\t---Media---")
media = []
suma = 0; aux = 0
for i in range(m):
    for j in range(k):
        suma = suma + C[i][j]
    media.append(suma/k)
    print(codigo[i],": ",media[i],"   ")
    suma = 0

#Ordenar el vector media
for i in range(m):
    for j in range(1,k):
        if media[i] > media[j]:
            mayor = media[i]


#Seleccionar los aspirantes para n puestos
selec = []
for i in range(m):
    for j in range(k):
        if media[i] > media[j]:
            aux = media[i]
            media.append(media[j])
            media[j] = aux


print("\t---ASPIRANTES SELECCIONADOS---")
print("Para",n," puestos de trabajo: ")
for i in range(n):
    print(codigo[i]," es aspirante seleccionado con una media de: ", media[i])
