/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crepetitivos;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Pow {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        
        int base, pot, result;
        int i;
        
        base = 0; pot = 0; result= 1; i = 1;
        
        //Ingreso de Datos
        
        System.out.println("Ingrese la base del número:");
        base = leer.nextInt();
        System.out.println("Ingrese la potencia: ");
        pot = leer.nextInt();
        
        //Proceso y Salida
        while (i <= pot){
            result = result * base;
            i = i + 1;
        }
        System.out.println("La potencia de " +base +" es " +result);
    }
  
}
