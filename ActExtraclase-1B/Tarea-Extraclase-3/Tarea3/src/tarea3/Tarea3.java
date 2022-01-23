/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea3;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Tarea3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaración e incicialización de las Variables
        
        int num1, num2, dife;
        
        num1 = 0; num2 = 0; dife = 0;
        
        //Entrada de Datos
        System.out.println("Analizar si la diferencia entre dos números enteros es un divisor"
                + " exacto de uno de ellos");
        System.out.println("Ingrese el número mayor: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el número menor: ");
        num2 = leer.nextInt();
        
        //Proceso
        dife = (num1 - num2);
        if (num1 > num2){
            if (((num1 % dife)==0) && ((num2 % dife)==0)){
                System.out.println("La diferencia entre los dos números es: " +dife +   
                        " y " +dife +" es divisor de " +num1 + " y " +num2);
            }
            else {
               if ((num1 % dife)==0){
                System.out.println("La diferencia entre los dos números es: " +dife +
                            " y " +dife +" es divisor de " +num1);
                }
                if ((num2 % dife)==0){
                System.out.println("La diferencia entre los dos números es: " +dife +   
                        " y " +dife +" es divisor de " +num2);
                }
                else {
                System.out.println("La diferencia entre los dos números: " +dife +
                            " no es divisor de ninguno de los dos números");
                } 
            }
        }
        else {
          if (num2 > num1) {
            System.out.println("Las cantidades están siendo ingresadas de forma errónea");
            }  
        }
    }
}
