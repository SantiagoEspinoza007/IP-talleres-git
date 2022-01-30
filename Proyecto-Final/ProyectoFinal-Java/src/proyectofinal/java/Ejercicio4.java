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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de variables
        int i, j, m, n, f1, f2;
        m = 0; n = 0; f1 = 0; f2 = 0;
        
        System.out.println("\t----Intercambiar de posición 2 filas de la matriz----");
        
        //Determinar el tamaño de la matriz
        System.out.print("¿Cuántas filas va a tener la matriz a ingresar?: ");
        m = leer.nextInt();
        System.out.print("\n¿Cuántas columnas va a tener la matriz a ingresar?: ");
        n = leer.nextInt();
        
        //Declaración de la matriz
        int A [] [] = new int [m][n];
        
        //Ingreso de los datos de la matriz
        System.out.println("\nIngresar los elementos de la matriz A: ");
        for (i= 0; i<m; i++ ){
            for (j = 0; j<n; j++){
                    System.out.print("A[" +i +"] [" +j +"] = ");
                    A[i][j] = leer.nextInt();
            }
        } 
        //Determinar las filas a intercambiar
        System.out.print("\nIngrese el valor de la primera fila a intercambiar: ");
        f1 = leer.nextInt();
        System.out.print("\nIngrese el valor de la segunda fila a intercambiar: ");
        f2 = leer.nextInt();
        
        System.out.println("La matriz Original es:");
        for(i= 0; i<m; i++ ){
            for (j = 0; j<n; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        A = intercambiar(A, m, n, f1 ,f2);
        System.out.println("La matriz A es:");
        for(i= 0; i<m; i++ ){
            for (j = 0; j<n; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
    }
    public static int [][]intercambiar(int [][] A, int m, int n, int f1, int f2){
        //Proceso para intercambiar las filas solicitadas
        int aux, i, j;
        for (i = 0; i<m; i++){
            for ( j = 0; j<n; j++){
                if(i==f1){
                    aux = A[i][j];
                    A[i][j]= A[f2][j];
                    A[f2][j] = aux;
                    aux = 0;
                }
            }
        }
        return A;
    }
}
