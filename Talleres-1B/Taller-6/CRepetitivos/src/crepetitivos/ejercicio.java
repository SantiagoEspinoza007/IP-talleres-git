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
public class ejercicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de variables
        int i, n;
        double term, sum, num, den;
        
        num = 1; den = 2; term = 0; sum = 0;
        i = 1; n = 0;
        
        //Entrada de Datos
        System.out.println("Ingrese el límite de la sucesión: ");
        n = leer.nextInt();
        
        //Proceso
        
        term = num / den;
        sum = sum + term;
        
        while (i <= n) {
            term = num / den;
            System.out.println("El término " +i +" es " +num +"/" +den);
            sum = sum + term;
            num = num + 2;
            den = den + 3;
            i = i + 1;
        }
        System.out.println("La suma es: " +sum);
    }
}
