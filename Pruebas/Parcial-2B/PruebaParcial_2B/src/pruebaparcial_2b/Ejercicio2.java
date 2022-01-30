/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaparcial_2b;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t---Matriz Simétrica o no---");
        //Declaración e Inicialización
        int m, i, j; 
        boolean bandera;
        m = 0;
        
        //Ingreso del límite de la matriz
        System.out.println("¿Cuántas filas y columnas va a tener la matriz?");
        m = leer.nextInt();
        int [][] A = new int [m] [m];
        
        bandera = MatrizSimetrica(A, m);
        if (bandera == false){
            System.out.println("La matriz no es simetrica");
        }
        else{
            if (bandera == true)
           System.out.println("La matriz es simetrica"); 
        }
        
    }
    public static boolean MatrizSimetrica(int [][]A, int m){
        Scanner leer=new Scanner(System.in);
        int i, j;
        System.out.println("\nIngresar los elementos de la matriz: ");
        for (i= 0; i<m; i++ ){
            for (j = 0; j<m; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        
        //Determinar si es simetrica o no
        for (i= 0; i<m; i++ ){
            for (j = 0; j<m; j++){
                if (A [i][j]!=A[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
