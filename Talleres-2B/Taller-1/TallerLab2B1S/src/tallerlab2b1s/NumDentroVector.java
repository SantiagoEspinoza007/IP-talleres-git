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
public class NumDentroVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e inicialización de las Variables 
        int i, n, num, cont;
        i = 0;  n= 0; num = 0; cont = 0;
        
        //Declaración e Inicialización
        System.out.println("\t ----CONTAR Y BUSCAR UN NÚMERO DENTRO DE UN VECTOR----\n");
        System.out.println("¿Cuantos números van a ser ingresados?");
        n = leer.nextInt();
        
        //Declaración del vector
        int [] A = new int [n];
        
        //Ingreso de los elementos del vector
	for (i=0; i<n; i++){
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i]= leer.nextInt();
        }
        
        //Ingreso del número
        System.out.println("Ingrese el número a verificar");
        num = leer.nextInt();
        
        //Proceso 
        for (i=0; i<n; i++){
            if (num == A[i]){
                cont = cont + 1;
                System.out.println("El número " +num +" se encuentra en la posición: A[" +i +"] \t");
            }
        }
        System.out.println("\nEl número " +num +" se repetio " +cont +" veces"); 
    }
}
