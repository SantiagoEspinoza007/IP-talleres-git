#Ingreso de Datos

print("Programa para calcular la edad de una persona en días, meses y años \n")
print("--Ingrese la fecha de Nacimiento--")
d_nacim = int(input("Día de Nacimiento: "))
m_nacim = int(input("Mes de Nacimiento: "))
a_nacim = int(input("Año de Nacimiento: "))
"\n"
print("--Ingrese la fecha Actual--")
d_actu = int(input("Día actual: "))
m_actu = int(input("Mes actual: "))
a_actu = int(input("Año actual: "))

#Proceso Y Salida

a_resul = (a_actu - a_nacim)
if m_actu >= m_nacim:
    m_resul = (m_actu - m_nacim)
else:
    m_resul = ((m_actu + 12) - m_nacim)
    a_resul = (a_resul - 1)
if d_actu >= d_nacim:
    d_resul = (d_actu - d_nacim)
else: 
    print("1.  El mes de nacimiento tiene 30 días")
    print("2.  El mes de nacimiento tiene 31 días")
    print("3.  El mes de nacimiento tiene 28 días")
    opc = input("Ingrese una opción según corresponda al mes de nacimiento: ")
    if opc =='1':
        d_resul = 30

    if opc =='2':
        d_resul = 31

    if opc =='3':
        d_resul = 28
    else: 
        print("Opcion no valida")

    d_resul = (d_resul - d_nacim) + d_actu
    m_resul = (m_resul - 1)

print("Tienes ", a_resul, " años, ", m_resul, " meses y ", d_resul, " días.")

