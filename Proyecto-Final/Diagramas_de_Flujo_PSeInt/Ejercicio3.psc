Algoritmo Ejercicio3
	Escribir "---Contar los n�meros terminados en 3 de un vector---"
	//Declaraci�n e Inicializaci�n de variables
	Definir num, i Como Entero
	num <- 0
	//Declaraci�n e Ingreso de datos en el vector
	Dimension A[10]
	Escribir "Ingrese los elementos del vector"
	Para  i <- 1 Hasta 10 Hacer
		Escribir Sin Saltar"A[",i,"]= "
		Leer A[i]
	FinPara
	num <- Buscar_Numeros (A)
	Escribir "En el vector ingresado se han encontrado ",num," n�meros terminados en 3."
	
FinAlgoritmo

Funcion num1 <- Buscar_Numeros (A)
	//Declaraci�n e Inicializaci�n de variables
	Definir num1, i Como Entero
	num1 <- 0
	//Proceso para contar los n�meros terminados en 3
	Para i <- 1 Hasta 10 Hacer
		si (A[i] mod 10 == 3) Entonces
			num1 = num1 + 1
		FinSi
	FinPara
FinFuncion

