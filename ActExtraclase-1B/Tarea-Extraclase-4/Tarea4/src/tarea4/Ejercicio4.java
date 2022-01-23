/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    //Generar la serie fibonacci
        //Declaración e Inicialización de las Variables
        
        int i, total, n, n1 , n2;
        i = 3; total = 0; n = 0; n1 = 0; n2 = 1;
        
        //Ingreso del límite de la serie
        System.out.println("****SERIE FIBONACCI****\n");
        System.out.println("Ingrese el número de terminos: ");
        n = leer.nextInt();
        
        //Proceso y Salida
        System.out.println("\n" +n1 +"\n" +n2);
        
        do{
            total = n1 + n2;
            n1 = n2;
            n2 = total;
            System.out.println(total);
            i = i + 1;
        }while(i<=n);
    }
}
