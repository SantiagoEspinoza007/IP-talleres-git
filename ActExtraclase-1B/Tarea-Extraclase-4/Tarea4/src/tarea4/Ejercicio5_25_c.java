/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_25_c {
    public static void main(String[] args) {
      // c)
        
        //Declaración e Inicialización de las Variables
        int  total, i;
        total = 0; i = 10;
        
        //Proceso y salida
        do{
            total = total + i;
            i = i + 1;
            System.out.println(total);
        }while(i<=15);
    }
}
