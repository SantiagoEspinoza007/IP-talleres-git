#Ingreso de Datos
print("---Programa para convertir de metros a otras unidades longitudinales---")
nombre = input("Ingrese el nombre de usuario: ")

#Entrada de datos
metros = float(input("Ingrese el valor en metros: "))

#Proceso
cm = (metros * 100)
km = (metros / 1000)
ft = (metros * 3.281)
in_ = (metros * 39.37)

#Salida
print("Los metros convertidos en centimetros son: " "\n",cm, "centimetros")
print("Los metros convertidos en kilometros son:" "\n", km, "kilometros")
print("Los metros convertidos en pies son:" "\n", ft, "pies")
print("Los metros convertidos en pulgadas son:" "\n", in_, "pulgadas")
