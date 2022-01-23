print("\t***Programa para analizar las calificaciones de un estudiante***")

#Ingreso de Datos
n = float(input("Ingrese la calificación sobre 5 puntos: "))

#Proceso y Salida
if n >= 3.0:
    if (n >= 4.6)and(n <= 5.0):
        print("Estudiante Excelente")
    else:
        if (n > 4.1)and(n <= 4.5):
            print("El alumno es muy bueno")
        else:
            if (n >3.6)and(n <= 4.0):
                print("El alumno registro un desempeño Aceptable")
            else: 
                if (n >= 3.0) and (n <= 3.2):
                    print("Alumno Aprobado")
else:
    print("El alumno registra una Calificación no aprobatoria")

