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
public class NumMenor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t----IDENTIFICAR EL NÚMERO MENOR DE CADA FILA----");
        //Declaración e Inicialización 
        int n, i, j, k, l, menor;
        n = 0; k = 0; l = 0; menor = 0;
        
        //Ingreso del límite de la matriz
        System.out.println("¿Cuántas filas y columnas va a tener la matriz?");
        n = leer.nextInt();
        
        //Ingreso de los elementos de la matriz
        int A [][] = new int [n][n];
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        
        //Presentar la matriz original
        for(i= 0; i<n; i++ ){
            for (j = 0; j<n; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        //Identificar los numeros menores de cada fila
        for(i=0; i<n; i++){
            menor = A[i][0];
            for (j=0; j<n; j++){
                if (A[i][j] < menor){
                    menor = A[i][j];
                    k = i;
                    l = j;
                }
            }
            System.out.println("El elemento menor de la fila " +i +" es " +menor +" y está en: A[" +k +"][" +l +"]");
            k = 0; 
            l = 0;
        }
    }
}
