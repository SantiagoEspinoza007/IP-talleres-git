#Ingreso de Datos
print("----Programa para calcular la nota final de un estudiante----")
nombre = input("Ingrese el nombre del estudiante: ")

#Entrada de Datos
tra = float(input("Ingrese la nota de trabajos sobre 10: "))
lec = float(input("Ingrese la nota de lecciones sobre 10: "))
parti = float(input("Ingrese la nota de participaciones sobre 10: "))
exa_f = float(input("Ingrese la nota del examen final sobre 10: "))

#Proceso
a = ((tra * 20)/100)
b = ((lec * 30)/100)
c = ((parti * 10)/100)
d = ((exa_f * 40)/100)

total = (a + b + c + d)

#Salida de Datos
print("La nota final del estudiante es: " "\n",total)
