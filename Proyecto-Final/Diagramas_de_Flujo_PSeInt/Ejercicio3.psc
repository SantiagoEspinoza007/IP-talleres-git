Algoritmo Ejercicio3
	Escribir "---Contar los números terminados en 3 de un vector---"
	//Declaración e Inicialización de variables
	Definir num, i Como Entero
	num <- 0
	//Declaración e Ingreso de datos en el vector
	Dimension A[10]
	Escribir "Ingrese los elementos del vector"
	Para  i <- 1 Hasta 10 Hacer
		Escribir Sin Saltar"A[",i,"]= "
		Leer A[i]
	FinPara
	num <- Buscar_Numeros (A)
	Escribir "En el vector ingresado se han encontrado ",num," números terminados en 3."
	
FinAlgoritmo

Funcion num1 <- Buscar_Numeros (A)
	//Declaración e Inicialización de variables
	Definir num1, i Como Entero
	num1 <- 0
	//Proceso para contar los números terminados en 3
	Para i <- 1 Hasta 10 Hacer
		si (A[i] mod 10 == 3) Entonces
			num1 = num1 + 1
		FinSi
	FinPara
FinFuncion

