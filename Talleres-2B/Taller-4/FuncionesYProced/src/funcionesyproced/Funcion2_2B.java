/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproced;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Funcion2_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        boolean band;
        
        System.out.println("\tFuncion para verificar si un número es positivo o negativo");
        System.out.print("Ingrese el número a verificar: ");
        num= leer.nextInt();
        
        band = funNegPos (num); //Asigna el valor que devuelve la función
        
        if (band == true){
            System.out.println("\nEl número " +num +" es positivo");
        }
        else{
            System.out.println("\nEl número " +num +" es negativo");
        }
        System.out.println("\n\t---FIN DE FUNCIÓN 1---");
        
        //Comprobar directamente con el llamado a la función
        if (funNegPos(num) == true){
            System.out.println("\nEl número " +num +" es positivo");
        }
        else{
            System.out.println("\nEl número " +num +" es negativo");
        }
        System.out.println("\n\t---FIN DE FUNCIÓN 2---");
    }
    public static boolean funNegPos(int numero) {
        if (numero>0){
            return true;
            
        }
        else{
            return false;
        }
    }
}
