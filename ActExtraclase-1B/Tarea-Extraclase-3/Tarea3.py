#Ingreso de Datos
print ("Analizar si la diferencia entre dos números enteros es un divisor exacto de uno de ellos \n")
num1 = int(input("Ingrese el número mayor: "))
num2 = int(input("Ingrese el número menor: "))

#Proceso y Salida
dife = num1 - num2
if num1 > num2:
    if num1 % dife == 0 and num2 % dife == 0:   
        print("La diferencia entre los dos números es: ", dife,   
                " y ", dife, " es divisor de ", num1, " y ", num2)
    else: 
        if num1 % dife == 0:
            print("La diferencia entre los dos números es: ", dife, 
                    " y ", dife, " es divisor de ", num1)
        if num2 % dife == 0:    
            print("La diferencia entre los dos números es: ", dife,   
                    " y ", dife, " es divisor de ", num2)   
        else:
            print("La diferencia entre los dos números: ", dife, 
                    " no es divisor de ninguno de los dos números")   
else:
    if num2 > num1:
        print("Las cantidades están siendo ingresadas de forma errónea")      
