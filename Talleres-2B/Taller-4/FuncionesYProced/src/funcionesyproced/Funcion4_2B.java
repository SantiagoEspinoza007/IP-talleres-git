/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproced;
import java.util.Scanner;
import static funcionesyproced.Funcion3_2B.Impar;
/**
 *
 * @author Santiago Espinoza
 */
public class Funcion4_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        
        boolean esImpar, esPrimo;
        
        System.out.println("\tFunción para verificar si un número es impar y primo");
        
        System.out.print("\nIngrese el número a verificar: ");
        num = leer.nextInt();
        
        esImpar = Impar(num);
        if (esImpar == true){
            esPrimo = Primo(num);
            if (esPrimo == true){
                System.out.println("\nEl número " +num +" es impar y es primo");
            }
            else{
                System.out.println("\nEl número " +num + " es impar y no es primo");
            }
        }
        else {
            System.out.println("El número no es impar por lo tanto no se verifica que sea primo");
        }
    }
    public static boolean Primo(int numero) {
        int div = 0;
        
        for (int i = 1; i<=numero; i++){
            if (numero % i == 0){
                div = div + 1;
            }
        }
        if (div == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
