/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_25_f {
    public static void main(String[] args) {
        // f)
        
        //Declaración e Inicialización de las Variables
        double  total, j;
        
        total = 1; j = 1;
        
        //Proceso y salida
        do{
            total = total / 2;
            j = j + 1;
            System.out.println(total);
        }while(j<=5);
    }
}
