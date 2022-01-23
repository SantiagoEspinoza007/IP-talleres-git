/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Mayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las variables
        double num1, num2, num3, total;
        
        num1 = 0; num2 = 0; num3 = 0;
        
        //Ingreso de los Datos
        System.out.println("Identificador del mayor de 3 números");
        
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el segúndo número: ");
        num2 = leer.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        num3 = leer.nextDouble();
        
        //Proceso y Salida
        if ((num1 > num2)&&(num1 > num3)){
            total = num1;
            System.out.println("El mayor de los 3 números es: " +total);
        }
        if ((num2 > num1) && (num2 > num3)){
            total = num2;
            System.out.println("El mayor de los 3 números es: " +total);
        }   
        if ((num3 > num1) && (num3 > num2)){
            total = num3;
            System.out.println("El mayor de los 3 números es: " +total);
        }
    }
}
