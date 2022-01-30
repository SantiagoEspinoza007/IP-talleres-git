/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal.java;

import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class ProyectoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t---PRESENTAR LOS NUMEROS COMPRENDIDOS ENTRE 1 Y EL NÚMERO INGRESADO---");
        //Declaración e Inicialización de las variables
        int n, i, j;
        n = 0; i=0; j=0;
        
        //Se pregunta el límite del vector
        System.out.print("¿Cuántos números va a ingresar?: ");
        n = leer.nextInt();
        
        //Declaración e Ingreso de datos en el vector
        int A [] = new int [n];
        System.out.println("Ingrese los elementos del vector"); 
        for (i=0; i<n; i++){
            System.out.print("A["+i+"]= ");
            A[i]=leer.nextInt();
        }
        for(i=0; i<n; i++){
            System.out.println("Los números comprendidos entre 1 y " +A[i]+" son: ");
            for(j=1; j<=A[i]; j++){
                System.out.print(j+", ");
            }
            System.out.println("");
        }
    }
}
