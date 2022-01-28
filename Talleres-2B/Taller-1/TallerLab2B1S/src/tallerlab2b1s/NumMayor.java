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
public class NumMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t ----ENCONTRARR EL NÚMERO MAYOR DENTRO DE UN VECTOR----\n");
        
        //Declaración e Inicialización de las Variables
        int i, n, mayor;
        i = 0; n = 0; mayor = 0;
        
        //Ingreso del limite
        System.out.println("¿Cuántos elementos va a tener su vector?");
        n = leer.nextInt();
        
        //Declaración del vector 
        int [] A = new int [n];
        
        //Ingreso de los elementos del vector 
        for (i=0; i<n; i++) {
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i] = leer.nextInt();
        }
        
        //Proceso
        mayor = A[0];
        
        for (i = 1; i<n; i++){
            if (A[i] > mayor){
                mayor = A[i];
            }
        }
        System.out.println("El número mayor del vector es: " +mayor);
    }
}
