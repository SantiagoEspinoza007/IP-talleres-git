Algoritmo Ejercicio4
	Escribir "----Intercambiar de posición 2 filas de la matriz----"
	//Declaración e Inicialización de variables
	Definir i, j, m, n, f1, f2 Como Entero
	i<-0; j<-0 ; m <- 0; n <- 0; f1<-0; f2 <- 0
	
	//Determinar el tamaño de la matriz
	Escribir Sin Saltar "¿Cuántas filas va a tener la matriz a ingresar?: "
	Leer m
	Escribir Sin Saltar "¿Cuántas columnas va a tener la matriz a ingresar?: "
	Leer n
	
	Escribir "Sus matrices A y B son de tamaño", m,"X",n
	//Declaración e Ingreso de datos en la matriz A
	Dimension A[m, n]
	Escribir "Ingresar los elementos de la matriz A: "
	Para  i <- 1 Hasta m Hacer
		Para  j <- 1 Hasta n Hacer
			Escribir Sin Saltar"A[",i,"] [",j,"] = "
			Leer A[i, j]
		FinPara
	FinPara
	//Determinar las filas a intercambiar
	Escribir Sin Saltar "Ingrese el valor de la primera fila a intercambiar: "
	Leer f1
	Escribir Sin Saltar "Ingrese el valor de la segunda fila a intercambiar: "
	Leer f2
	
	//Presentar la matriz A
	Escribir "La matriz Original es: "
	Para  i <- 1 Hasta m Hacer
		Para  j <- 1 Hasta n Hacer
			Escribir Sin Saltar A[i, j], "  "
		FinPara
		Escribir ""
	FinPara
	
	//Proceso para intercambiar las filas solicitadas
	Definir aux Como Entero
	aux <- 0
	Para  i <- 1 Hasta m Hacer
		Para  j <- 1 Hasta n Hacer
			si (i==f1) Entonces
				aux <- A[i, j]
				A[i, j] <- A[f2, j]
				A[f2, j] <- aux
				aux <- 0
			FinSi
		FinPara
	FinPara
	
	Escribir "La matriz A es: "
	Para  i <- 1 Hasta m Hacer
		Para  j <- 1 Hasta n Hacer
			Escribir Sin Saltar A[i, j], "  "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo


	