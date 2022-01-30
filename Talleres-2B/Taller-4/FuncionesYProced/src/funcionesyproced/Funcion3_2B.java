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
public class Funcion3_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        
        boolean esImpar;
        
        System.out.println("\t---Función para verificar si un número es impar y procedimiento para verificar si es primo");
        
        System.out.print("\nIngrese el número a verificar: ");
        num = leer.nextInt();
        
        esImpar = Impar(num);
        
        if (esImpar == true){
            Primo(num);
        }
        else{
            System.out.println("\nEl número no es impar por lo cuál no se verifica si es primo");
        }
    }
    
    public static boolean Impar(int numero) {
        if ( numero % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void Primo(int numero) {
        int div=0;
        for (int i=1; i<=numero; i++){
            if (numero % i == 0){
                div = div + 1;
            }
        }
        if (div == 2){
            System.out.println("\nEl número " +numero +" es impar y es primo");
        }
        else{
            System.out.println("\nEl número " +numero +" es impar y no es primo");
        }
    }
}
