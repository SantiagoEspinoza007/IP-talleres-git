/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatrices;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t----SUMA DE DOS MATRICES A Y B EN UNA MATRIZ C----");
        //Declaración e Inicialización de las variables
        int n, i, j;
        n = 0;
        //Ingreso de datos en la matriz 
        System.out.println("Ingrese el tamaño de las matrices: ");
        n = leer. nextInt();
        
        System.out.println("Sus matrices A y B corresponden a un tamaño de: " +n +" X " +n);
        
        int [][] A = new int [n][n];
        System.out.println("\nIngrese los elementos de la matriz A: ");
        for (i=0; i<n; i++){
            for (j = 0; j<n; j++){
                System.out.println("A[" +i +"] [" +j +"] =");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nLa matriz A es: ");
        for (i = 0; i<n; i++){
            for ( j= 0; j<n; j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println("");
        }
        int [][] B = new int [n][n];
        System.out.println("\nIngrese los elementos de la matriz B: ");
        for (i=0; i<n; i++){
            for (j = 0; j<n; j++){
                System.out.println("B[" +i +"] [" +j +"] =");
                B[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nLa matriz B es: ");
        for (i = 0; i<n; i++){
            for ( j= 0; j<n; j++){
                System.out.print(B[i][j] +"\t");
            }
            System.out.println("");
        }
        
        int [][] C = new int [n][n];
        for (i=0; i<n; i++){
            for (j = 0; j<n; j++){
                C[i][j] = A[i][j] + B [i][j];
            }
        }
        System.out.println("\nLa matriz C es: ");
        for (i = 0; i<n; i++){
            for ( j= 0; j<n; j++){
                System.out.print(C[i][j] +"\t");
            }
            System.out.println("");
        }
    }   
}
