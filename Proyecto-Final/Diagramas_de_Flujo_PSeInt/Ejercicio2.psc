Algoritmo Ejercicio2
	Escribir "----VERIFICAR SI SON SEMEJANTES LOS PROMEDIOS DE LA DIAGONALDE AMBAS MATRICES----"
	//Declaración e Inicialización de las variables
	Definir i, j, diagonal1, suma1, suma2 Como Entero
	Definir promedio1, promedio2 Como Real
	diagonal <- 0; suma1<-0; suma2<-0; promedio1<-0; promedio2<-0;
	
	Escribir "Sus matrices A y B son de tipo 5 x 5"
	//Declaración e Ingreso de datos en la matriz A
	Dimension A[5, 5]
	Escribir "Ingresar los elementos de la matriz A: "
	Para  i <- 1 Hasta 5 Hacer
		Para  j <- 1 Hasta 5 Hacer
			Escribir Sin Saltar"A[",i,"] [",j,"] = "
			Leer A[i, j]
		FinPara
	FinPara
	//Ingreso de los elementos de la matriz B
	Dimension B[5, 5]
	Escribir "Ingresar los elementos de la matriz B: "
	Para  i <- 1 Hasta 5 Hacer
		Para  j <- 1 Hasta 5 Hacer
			Escribir Sin Saltar"B[",i,"] [",j,"] = "
			Leer B[i, j]
		FinPara
	FinPara
	Escribir "¿Qué diagonal desea analizar?"
	Escribir "1. Diagonal Principal"
	Escribir "2. Diagonal Secundaria"
	Leer diagonal
	
	Segun diagonal Hacer
		1: 
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Si (i == j) Entonces
						suma1 <- suma1 + A[i, j];
						promedio1 = suma1 / 5;
						suma2 <- suma2 + B[i, j];
						promedio2 = suma2 / 5;
					FinSi
				FinPara
			FinPara
			//Presentar la matriz A
			Escribir "La matriz A es: "
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Escribir Sin Saltar A[i, j], "  "
				FinPara
				Escribir ""
			FinPara
			//Presentar la matriz B
			Escribir "La matriz B es: "
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Escribir Sin Saltar B[i, j], "  "
				FinPara
				Escribir ""
			FinPara
			Escribir "El promedio de la diagonal principal de la matriz A es: ", promedio1
			Escribir "El promedio de la diagonal principal de la matriz B es: ", promedio2
			si (promedio1==promedio2) Entonces
				Escribir "Los promedios de la diagonal principal de ambas matrices son iguales"
			SiNo
				Escribir "Los promedios de la diagonal principal de ambas matrices no son iguales"
			FinSi
		2:
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Si (i+j == 6) Entonces
						suma1 <- suma1 + A[i, j];
						promedio1 = suma1 / 5;
						suma2 <- suma2 + B[i, j];
						promedio2 = suma2 / 5;
					FinSi
				FinPara
			FinPara
			//Presentar la matriz A
			Escribir "La matriz A es: "
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Escribir Sin Saltar A[i, j], "  "
				FinPara
				Escribir ""
			FinPara
			//Presentar la matriz B
			Escribir "La matriz B es: "
			Para  i <- 1 Hasta 5 Hacer
				Para  j <- 1 Hasta 5 Hacer
					Escribir Sin Saltar B[i, j], "  "
				FinPara
				Escribir ""
			FinPara
			Escribir "El promedio de la diagonal principal de la matriz A es: ", promedio1
			Escribir "El promedio de la diagonal principal de la matriz B es: ", promedio2
			si (promedio1==promedio2) Entonces
				Escribir "Los promedios de la diagonal principal de ambas matrices son iguales"
			SiNo
				Escribir "Los promedios de la diagonal principal de ambas matrices no son iguales"
			FinSi
		De Otro Modo:
			Escribir "Opción ingresada incorrecta"
	FinSegun
	
FinAlgoritmo
