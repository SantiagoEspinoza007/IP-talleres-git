/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlab2b1s;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class VectorxEscalar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización
        int i, n, escalar;
        i = 0; n = 0; escalar = 0;
        
        System.out.println("Ingrese el tamaño del vector: ");
        n = leer.nextInt();
        
        int [] A = new int [n];
        int [] B = new int [n];
        
        //Ingreso del escalar
        System.out.println("Ingrese el Escalar: ");
        escalar = leer.nextInt();
        
        //Ingreso de los elementos del vector
        for (i=0; i<n; i++){
            
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i]= leer.nextInt();
            
        }
        
        //Multiplicar por el escalar
        for (i=0; i<n; i++){
            
            B[i]=A[i] * escalar;
            
        }
        
        //Presentar el vector B
        for (i=0; i<n; i++){
            
            System.out.println("B [" +i +"]: " +B[i]);
            
        }
    }
}
