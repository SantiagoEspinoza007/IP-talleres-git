#Realice un algoritmo para leer las calificaciones de N alumnos y determine el número de aprobados y reprobados.

#Declaración de las Variables
i = 1; n = 0; apro = 0; repro = 0; calif = 0

#Proceso y Salida
n = int(input("Ingrese el número de estudaintes a verificar:"))

while (i<=n):
    calif=float(input("Ingrese la calificación del estudiante:"))
    if ((calif > 6.99) and (calif <= 10)):
        print("Estudiante Aprobado")
        apro = apro + 1
    else: 
        if (calif > 0) and (calif <= 6.99):
            print ("Estudiante Reprobado")
            repro = repro + 1
        else:
            print("La nota ingresada es erronea")
    calif = 0
    i = i + 1
print("Estudiantes Aprobados: ", apro)
print("Estudiantes Reprobados: ", repro)
