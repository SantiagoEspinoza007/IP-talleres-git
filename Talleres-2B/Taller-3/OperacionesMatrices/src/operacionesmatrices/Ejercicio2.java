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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t----REMPLAZAR ELEMENTOS SOBRE LA DIAGONAL PRINCIPAL DE UNA MATRIZ----");
        //Declaración e Inicialización de las variables
        int n, i, j;
        n = 0;
        //Ingreso de datos en la matriz 
        System.out.println("Ingrese el tamaño de la matriz: ");
        n = leer. nextInt();
        
        int [][] A = new int [n][n];
        System.out.println("Ingrese los elementos de la matriz A: ");
        for (i=0; i<n; i++){
            for (j = 0; j<n; j++){
                System.out.println("A[" +i +"] [" +j +"] =");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nLa matriz Original es: ");
        for (i = 0; i<n; i++){
            for ( j= 0; j<n; j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println("");
        }
        for (i = 0; i<n; i++){
            for (j = 0; j<n; j++){
                if (j>i){
                    A[i][j] = 0;
                }
            }
        }
        System.out.println("\nLa matriz remplazada con ceros es: ");
        for (i = 0; i<n; i++){
            for (j = 0; j<n; j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
