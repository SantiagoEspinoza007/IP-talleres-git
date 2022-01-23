/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

import java.util.Scanner;/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion
        int numl, i, j;
        numl = 0;
        
        //Ingreso 
        System.out.println("Ingrese el límite de líneas a mostrar: ");
        numl = leer.nextInt();
        
        //Proceso
        for (i = 1; i <= numl; i++){
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
