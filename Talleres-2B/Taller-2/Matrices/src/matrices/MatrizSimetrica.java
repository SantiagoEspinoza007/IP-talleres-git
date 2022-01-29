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
public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización
        int m, i, j, bandera;
        m = 0; bandera = 0;
        
        //Ingreso del límite de la matriz
        System.out.println("¿Cuántas filas y columnas va a tener la matriz?");
        m = leer.nextInt();
        
        //Ingreso de los elementos de la matriz
        int A [] [] = new int [m][m];
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i= 0; i<m; i++ ){
            for (j = 0; j<m; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        
        //Presentar la matriz original
        for(i= 0; i<m; i++ ){
            for (j = 0; j<m; j++){
                
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        //Determinar si es simetrica o no
        for (i= 0; i<m; i++ ){
            for (j = 0; j<m; j++){
                if (A [i][j]!=A[j][i]){
                    bandera = 1;
                }
            }
        }
        if (bandera == 1){
            System.out.println("La matriz no es simetrica");
        }
        else{
            if (bandera == 0)
           System.out.println("La matriz es simetrica"); 
        }
    }
}
