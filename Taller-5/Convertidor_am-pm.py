print("\t***Conversión de hora de 24 horas a 12 horas***")

#Ingreso de Datos
h24 = int(input("Ingrese la hora en formato 24H: "))
m24 = int(input("Ingrese los minutos en formato 24M: "))

#Proceso
if (h24 <= 24) and (h24 >= 0) and (m24 >= 0) and (m24 <= 60):
    if m24 == 60 :
        h24 = h24 + 1
        m24 = 0
    else:
        m12 = m24
    if h24 > 12 :
        h12 = h24 - 12
        periodo = "p.m"
        print("El tiempo de ", h24, " horas y ", m24, " minutos \n", 
            "equivale a ", h12, " horas y ", m12, " minutos", periodo)
    else:
        h12 = h24
        periodo = "a.m"
        print("El tiempo de ", h24, " horas y ", m24, " minutos \n", 
            "equivale a ", h12, " horas y ", m12, " minutos", periodo)
else:
    print("Error: la hora o los minutos ingresados no son invalidos")