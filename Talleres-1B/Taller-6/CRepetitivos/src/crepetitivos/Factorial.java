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
public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*
        //Declaración e Inicialización de las Variables
        int num, i, fact;
        num = 1; i = 1; fact = 1;
        
        //Ingreso de Datos
        System.out.println("Ingrese el número a analizar: ");
        num = leer.nextInt();
        
        while (num>0){
            fact = fact * num;
            num = num - 1;
        }
        System.out.println("El factorial del número ingresado es: " +fact);
        */
        
        //Declaración e Inicialización
        int num, i, fact, mult, total;
        num = 0; fact = 1; mult = 1; total = 1;
        
        //Ingreso de Datos
        
        System.out.println("¿De qué numero desea obtener el factorial? \n");
        num = leer.nextInt();
        
        
        //Proceso
        for (i=1; i<=num; i++){
            System.out.print(fact+"! = ");
            for (int j = 1; j<i;j++){
                System.out.print("(" +j +")");
            }
            System.out.println("(" +mult +")");
            fact = fact + 1;
            mult = mult +1;
            total = total * i;
        }    
        System.out.println(num+"! = " +total);
    }
}