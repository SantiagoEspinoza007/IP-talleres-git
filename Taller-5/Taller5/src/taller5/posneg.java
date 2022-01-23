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
public class posneg {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las variables
        double num1;
        
        num1 = 0;
        
        //Ingreso de los Datos
        System.out.println("Ingrese el número a verificar: ");
        num1 = leer.nextDouble();
        
        //Proceso y Salida
        
        if (num1 == 0){
            System.out.println("El número ingresado: " +num1 +" es neutro");
        }
        else{
            if (num1 > 0){
            System.out.println("El número ingresado: " +num1 +" es positivo");
            }
            else {
                System.out.println("El número ingresado: " +num1 +" es negativo");
            }
        }
    }
}
