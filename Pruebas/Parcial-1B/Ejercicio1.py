from pydoc import describe
import string


print("\t***Programa para calcular descuentos por tipo de cliente*** \n")

#Ingreso de Datos
nombre = input("Ingrese el nombre del Cliente: ")

tCliente = int(input("\nIngresar el tipo de cliente \n1. Docente \n2. Cliente \n3. Publico en general \nIngrese un número del 1 al 3: "))
cantLibros = int(input("\nIngresar la cantidad de libros: "))
costoLibro = float(input("Ingrese el costo de cada libro: "))

#Proceso
if tCliente == 1:
    desc = 0.30
else: 
    if tCliente == 2:
        desc = 0.20
    else:
        if tCliente == 3:
            desc = 0.10
        else:
            desc = 0

#Condición para determinar el descuento por cantidad  de Libros
if (cantLibros > 5)and( cantLibros <=10):
    desc += 0.04
else:
    if cantLibros > 10:
        desc += 0.08

#Obtener el subtotal y el valor neto a pagar
subTotal = cantLibros * costoLibro
descTotal = (subTotal * desc)
total = subTotal - descTotal

#Presentar los datos de Salida
print("\n->Nombre cliente: ", nombre)
print("->Total a pagar: ", subTotal)
print("->Descuento: ", descTotal)
print("\n->NETO A PAGAR: ", total)