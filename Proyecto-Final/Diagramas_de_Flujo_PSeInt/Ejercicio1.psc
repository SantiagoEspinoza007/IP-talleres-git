Algoritmo Ejercicio1
	Escribir "---PRESENTAR LOS NUMEROS COMPRENDIDOS ENTRE 1 Y EL NÚMERO INGRESADO---"
	//Declaración e Inicialización de las variables
	Definir n, i, j Como Entero
	n <- 0
	//Se pregunta el límite del vector
	Escribir "¿Cuántos números va a ingresar?: "
	Leer n
	//Declaración e Ingreso de datos en el vector
	Dimension A[n]
	Escribir "Ingrese los elementos del vector"
	Para  i <- 1 Hasta n Hacer
		Escribir Sin Saltar"A[",i,"]= "
		Leer A[i]
	FinPara
	Para  i <- 1 Hasta n Hacer
		Escribir "Los números comprendidos entre 1 y " ,A[i]," son: "
		Para  j <- 1 Hasta A[i] Hacer
			Escribir Sin Saltar j,", "
		FinPara
		Escribir " "
	FinPara
FinAlgoritmo
