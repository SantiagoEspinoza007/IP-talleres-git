print("\t******Programa para determinar si la diferencia de dos números es",
    " multiplo de alguno de ellos ****** \n")

#Ingreso de Datos
num1 = int(input("Ingrese el primer número: "))
num2 = int(input("Ingrese el segundo número: "))

#Proceso para obtener la diferencia y verificar si es múltiplo
dif = num1 - num2

if (num1 % dif == 0)and(num2 % dif == 0):
    print("La diferencia ",dif," es múltiplo de ",num1," y ",num2)
else:
    if num1 % dif == 0:
        print("La diferencia ",dif, "es múltiplo de ",num1," y ",num2)
    else:
        if num2 % dif == 0:
            print("La diferencia ",dif, "es múltiplo de ",num2)
        else:
            print("La diferencia ",dif, "es múltiplo de ",num1)
            