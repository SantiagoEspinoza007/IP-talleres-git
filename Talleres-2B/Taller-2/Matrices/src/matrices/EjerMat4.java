/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class EjerMat4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t---- EJERCICIO 4 - MATRICES ----");
        int n, i, j;
        n = 0; i= 0; j=0;
        
        //Ingresar el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz cuadrada: ");
        n=leer.nextInt();
        
        int[][] A = new int [n][n];
        
        //Ingresar los elementos de la matriz
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("\nMatriz A original ");
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz elemetnos pares ");
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                if (A[i][j] % 2 == 0){
                    A[i][j]=0;
                }
            }
        }
        
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz elementos i = n-1 || j = n-1 ");
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                if ((i == n-1)||(j == n-1)){
                    A[i][j]= 1;
                }
            }
        }
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
    }
}