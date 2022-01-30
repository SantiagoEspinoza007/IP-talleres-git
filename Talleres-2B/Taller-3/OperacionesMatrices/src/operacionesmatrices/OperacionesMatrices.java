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
public class OperacionesMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t----MATRIZ TRANSPUESTA----");
        Scanner leer = new Scanner(System.in);
        //Declaración e Inicialización de las variables
        int n, m, i, j;
        n = 0; m = 0;
        
        //Ingreso de datos en la matriz 
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        n = leer. nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        m = leer.nextInt();
        
        int [][] A = new int [n][m];
        System.out.println("Ingrese los elementos de la matriz A: ");
        for (i=0; i<n; i++){
            for (j = 0; j<m; j++){
                System.out.println("A[" +i +"] [" +j +"] =");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nLa matriz Original es: ");
        for (i = 0; i<n; i++){
            for ( j= 0; j<m; j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println("");
        }
        
        //Arreglo para la matriz
        System.out.println("\nLa matriz Transpuesta es: ");
        for (j = 0; j<m; j++){
            for (i = 0; i<n; i++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
