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
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de Variables
        double num1, num2, resp;
        int opc;
        
        num1 = 0; num2 = 0; resp = 0;
        
        //Ingreso de los Datos
        
        System.out.println("Calculadora Básica \n");
        
        System.out.println("Ingrese el valor del primer número");
        num1 = leer.nextDouble();
        System.out.println("Ingrese el valor del segundo número");
        num2 = leer.nextDouble();
        System.out.println("\n");
        System.out.println("Seleccione la operación del siguiente menú");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División \n");
        
        System.out.println("Ingrese una opción: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:{
                resp = num1 + num2;
                System.out.println("La suma es: " +resp);
            }
            break;
            case 2:{
                resp = num1 - num2;
                System.out.println("La resta es: " +resp);
            }
            break;
            case 3:{
                resp = num1 * num2;
                System.out.println("La multiplicación es: " +resp);
            }
            break;
            case 4:{
                resp = num1 / num2;
                System.out.println("La división es: " +resp);
            }
            break;
            default: 
                System.out.println("No existe la opción ingresada");
              break;
        }
    }
}
