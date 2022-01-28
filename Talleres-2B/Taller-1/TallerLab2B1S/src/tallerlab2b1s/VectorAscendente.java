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
public class VectorAscendente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización
        int i, j, n, aux;
        i = 0; j = 0; n = 0; aux = 0;
        
        //Declaración del límite
        System.out.println("\t---ORDENAR UN VECTOR DE N ELEMENTOS---");
        System.out.println("¿Cuantos números va a ingresar en el vector?");
        n = leer.nextInt();
        
        int [] A = new int [n];
        
        //Ingresar los datos del vector
        
        for (i=0; i<n; i++){
            
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i]= leer.nextInt();
            
        }
        
        //Presentar el vector
        System.out.println("\n \t ---VECTOR ORIGINAL---");
        for (i=0; i<n; i++){
            
            System.out.println("A[" +i +"]= " +A[i]);
            
        }
        
        System.out.println("\n \t ---VECTOR ORDENADO DE FORMA ASCENDENTE---");
        
        for (i = 0; i<n; i++){
            for (j = i+1; j<n; j++){
                if (A[i] > A[j]){
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        
        //Presentar el vector ordenado
        for (i=0; i<n; i++){
            
            System.out.println("A[" +i +"]= " +A[i]);
            
        }
        
        System.out.println("\n \t ---VECTOR ORDENADO DE FORMA DESCENDENTE---");
        
        for (i = 0; i<n; i++){
            for (j = i+1; j<n; j++){
                if (A[i] < A[j]){
                    aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }
        //Presentar el vector ordenado
        for (i=0; i<n; i++){
            
            System.out.println("A[" +i +"]= " +A[i]);
            
        }
        
    }
}
