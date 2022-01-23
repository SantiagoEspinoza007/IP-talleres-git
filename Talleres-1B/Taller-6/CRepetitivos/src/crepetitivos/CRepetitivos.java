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
public class CRepetitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int i, n, suma, j, suma1;
        i = 1; n = 1; suma = 0; j = 1; suma1 = 0;
        
        //Ingresar el límite del ciclo
        System.out.println("Ingrese el límite del ciclo");
        n = leer.nextInt();
        
        //Proceso
        while (i <= n) {
            suma = suma + i;
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("i es: " +i);
        
        System.out.println("La suma es: " +suma);
        System.out.println("\n");
        
        i = n; suma = 0;
        
        while (i >= 1){
            System.out.println("suma: " +suma);
            suma = suma +i;
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("i es: " +i);
        
        System.out.println("La suma es: " +suma);
        
        
    }
    
}
