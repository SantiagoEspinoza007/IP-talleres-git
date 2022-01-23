#Ingreso de Datos
print("----Programa para calcular el costo total de una llamada----")
nombre = input("Ingrese el nombre de usuario:")

#Entrada de Datos
min_llama = float(input("Ingrese los minutos que dura la llamada: "))
cos_min = float(input("Ingrese el costo por minuto de una llamada: "))

#Proceso
valor_total = min_llama * cos_min

#Salida de Datos
print("El costo total de la llamada es: " "\n",valor_total)