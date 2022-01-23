/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaparcial;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int num1, num2, total;
        
        //Entrada de Datos
        System.out.println("Analizar si la diferencia entre dos números es multiplo "
                + " de uno de ellos");
        System.out.println("Ingrese el número mayor: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el número menor: ");
        num2 = leer.nextInt();
        
        //Proceso y Salida
        total = num1 - num2;
        if (num1 > num2){
            if ((num1 % total)==0 && (num2 % total)== 0){
                System.out.println("La diferencia de ambos números es igual a: " +
                            total +" y " +total +" es multiplo de: " +num1 +" y " +num2);
            
            }
            
            else {
                if ((num1 % total)==0) {
                    System.out.println("La diferencia de ambos números es igual a: " +
                            total +" y " +total +" es multiplo de: " +num1);
                }
                else {
                    if ((num2 % total)==0){
                        System.out.println("La diferencia de ambos números es igual a: " +
                            total +" y " +total +" es multiplo de: " +num2);
                    }
                    System.out.println("La diferencia de ambos números es igual a: " +total 
                    +" y " +total +" no es multiplos ni de " +num1 +" ni de " +num2);
                }
            }
        }
        else {
            System.out.println("Los números están siendo ingresados de forma erronea");
        }
    }
}
