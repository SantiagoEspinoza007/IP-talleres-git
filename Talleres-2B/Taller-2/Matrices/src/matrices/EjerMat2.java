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
public class EjerMat2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t----EJERCICIO CON MATRICES----");
        int n, m, i, j;
        n = 0; m= 0; i= 0; j=0;
        
        //Ingresar el tamaño de la matriz
        System.out.println("Ingrese el número de filas: ");
        n=leer.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        m= leer.nextInt();
        
        int[][] A = new int [n][m];
        
        //Ingresar los elementos de la matriz
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i= 0; i<n; i++ ){
            for (j = 0; j<m; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        System.out.println("\nLa Matriz A es: ");
        for(i= 0; i<n; i++ ){
            for (j = 0; j<m; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        int suma = 0;
        
        int [] B = new int [n];
        
        for (i= 0; i<n; i++){
            for (j = 0; j<m; j++){
                suma = suma + A[i][j];
            }
            B[i]= suma;
            suma = 0;
        }
        
        System.out.println("\nEl vector B es: ");
        for(int k = 0; k<n; k++ ){
            
            System.out.print(B[k]+ " ");
            
        }
        System.out.println("\n");
    }
}
