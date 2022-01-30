print("---ERROR DE TIPO ARITMETICO---")
#Proceso
try:
    nota1 = 9
    nota2 = 0
    notaFinal = nota1/nota2
    print("La nota final es: ",notaFinal)
except ZeroDivisionError:
    print("Lo sentimos, hay un error [Divisón para 0]")
