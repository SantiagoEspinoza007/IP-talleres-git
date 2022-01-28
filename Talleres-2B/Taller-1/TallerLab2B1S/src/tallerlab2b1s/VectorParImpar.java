/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlab2b1s;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class VectorParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e inicialización de las Variables 
        int n, i, par, impar;
        n = 0; par = 0; impar = 0;
        
        //Declaración e Inicialización
        System.out.println("\t ----CLASIFICAR UN VECTOR SEGÚN SUS NÚMEROS SEAN PARES O IMPARES----\n");
        System.out.println("¿Cuantos números van a ser ingresados?");
        n = leer.nextInt();
        
        //Declaración del vector base
        int [] A = new int [n];
        
        //Ingresar los datos del vector base
        for (i=0; i<n; i++){  
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i]= leer.nextInt();
        }
        
        //Proceso      
        for (i = 0; i<n; i++){
            if (A[i] % 2 == 0){
                par = par + 1;
            }
            else{
                impar = impar + 1;
            }
        }
        
        //Declaración y definición del vector B par y vector C impar
        int [] B = new int [par];
        int [] C = new int [impar];
        
        //Proceso
        par = 0;
        impar = 0;
        for (i = 0; i<n; i++){
            if (A[i] % 2 == 0){
                B[par]= A[i];
                par = par + 1;
            }
            else{
                C[impar]= A[i];
                impar = impar + 1;
            }
        }
        
        //Presentar el vector Original
        System.out.println("\n \t ---VECTOR ORIGINAL---");
        for (i=0; i<n; i++){
            System.out.println("A[" +i +"]= " +A[i]);
        }
        
        //Presentar el vector Pares
        System.out.println("\n \t ---VECTOR CORRESPONDIENTES A NUMEROS PARES---");
        for (i = 0; i<par; i++){
            System.out.println("B[" +i +"]= " +B[i]);
        }
        
        //Presentar el vector Impares
        System.out.println("\n \t ---VECTOR CORRESPONDIENTES A NUMEROS IMPARES---");
        for (i = 0; i<impar; i++){
             System.out.println("C[" +i +"]= " +C[i]);
        }
    }
}
