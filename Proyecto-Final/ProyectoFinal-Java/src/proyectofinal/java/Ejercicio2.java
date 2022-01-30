/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.java;

import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t----VERIFICAR SI SON SEMEJANTES LOS PROMEDIOS DE LA DIAGONAL----\n \t\t\t  DE AMBAS MATRICES");
        
        //Declaración e Inicialización de las variables
        int i, j, diagonal, suma1, suma2;
        double promedio1, promedio2;
        String diagonalstr = "principal";
        diagonal = 0; suma1=0; suma2=0; promedio1=0; promedio2=0;
        System.out.println("Sus matrices A y B son de tipo 5 x 5");
        //Ingreso de los elementos de la matriz A
        int A [] [] = new int [5][5];
        System.out.println("\nIngresar los elementos de la matriz A: ");
        for (i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                    System.out.print("A[" +i +"] [" +j +"] = ");
                    A[i][j] = leer.nextInt();
            }
        }
        //Ingreso de los elementos de la matriz B
        int B [] [] = new int [5][5];
        System.out.println("\nIngresar los elementos de la matriz B: ");
        for (i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                System.out.print("B[" +i +"] [" +j +"] = ");
                 B[i][j] = leer.nextInt();
            }
        }
        System.out.println("\n¿Qué diagonal desea analizar?");
        System.out.println("1. Diagonal Principal");
        System.out.println("2. Diagonal Secundaria");
        diagonal = leer.nextInt();
        switch(diagonal){
            case 1:
                for (i= 0; i<5; i++ ){
                    for (j = 0; j<5; j++){
                        if (i == j){
                            suma1 = suma1 + A[i][j];
                            promedio1 = suma1 / 5;
                            suma2 = suma2 + B[i][j];
                            promedio2 = suma2 / 5;
                        }
                    }
                }
                break;
            case 2:
                for (i= 0; i<5; i++ ){
                    for (j = 0; j<5; j++){
                        if (i+j == 4){
                            suma1 = suma1 + A[i][j];
                            promedio1 = suma1 / 5; 
                            suma2 = suma2 + B[i][j];
                            promedio2 = suma2 / 5;
                        }
                    }
                }
                break;
            default:
                System.out.println("Opción ingresada incorrecta");
                break;
        }
        //Presentar la matriz A
        System.out.println("La matriz A es:");
        for(i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        //Presentar la matriz B
        System.out.println("La matriz B es:");
        for(i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                System.out.print(B[i][j]+ "\t");
            }
            System.out.println("");
        }
        if (diagonal == 2){
            diagonalstr = "secundaria";
        }
        System.out.println("\nEl promedio de la diagonal "+diagonalstr+" de la matriz A es: " +promedio1);
        System.out.println("El promedio de la diagonal "+diagonalstr+" de la matriz B es: " +promedio2);
        if (promedio1 == promedio2){
            System.out.println("\nLos promedios de la diagonal " +diagonalstr+" de ambas matrices son iguales");
        }
        else{
            System.out.println("\nLos promedios de la diagonal "+diagonalstr+" de ambas matrices no son iguales");
        }    
    }
}
