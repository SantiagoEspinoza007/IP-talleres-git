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
public class tabla {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declaración e Inicicialización de las variables
        
        int num, i, n, total;
        num = 1; i = 1; total = 0;
        
        //Entrada de Datos
        System.out.println("Ingrese el número a multiplicar: ");
        num = leer.nextInt();
        System.out.println("Ingrese el límite de multiplos a obtener: ");
        n = leer.nextInt();
        
        //Proceso
        while (i <= n){
            total = num * i;
            System.out.println("La respuesta de: " +num +" X " +i +" = " +total);
            i = i + 1;
        }
    }
}
