/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        try{
            System.out.println("Ingrese el valor 1");
            int valor1 = leer.nextInt();
        
            System.out.println("Ingrese el valor 2");
            int valor2 = leer.nextInt();
        
            int result = valor1/valor2;
        
            System.out.println("El resultado es: " +result);
        }
        
        catch(InputMismatchException ExcepcionErrorEntrada){
            System.out.println("Existe un error en la entrada de datos");
            System.out.println("de tipo: "+ExcepcionErrorEntrada);
        }
    }
}
