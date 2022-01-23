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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    //22. Describa la salida de los siguientes ciclos:
    
      // a)
      
        //Declaración e Inicialización de las Variables
        int i, j;
        i = 1; j = i;
        
        //Proceso y Salida
        do {
            System.out.println(i);
            while (j<1){
                System.out.println(j);
                j = j - 2;
            }
            i= i + 1;
        }while(i<=5);
 
    }   
}
