print("\t**Programa para calcular el área de un poligono compuesto**")

#Ingresar los Datos
lc = int(input("Ingrese el lado del cuadrado: "))
at = int(input("Ingrese la altura del triángulo: "))
ar = int(input("Ingresar la altura del rectángulo: "))

#Proceso
A = (lc * lc)
B = (lc * at)/2
ats = (B * 3)
D = lc * ar
area = A + ats + B

#Salida
print("El área total del poligono compuesto es: ", area, " con un cuadrado de area "    
, A, " con tres triángulos rectángulos de área ", ats, " y un ", "rectángulo de área ", D, "\n")