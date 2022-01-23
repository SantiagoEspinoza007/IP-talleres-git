/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_23_f {
    public static void main(String[] args) {
       // f) Al usar un contador cuenta que tiene valor inicial de 1.0, un valor final de 16.2 y un incremento de 0.2.
      
        //Declaración e Inicialización de las Variables
        double cuenta;
        cuenta = 1;
        
        //Proceso y Salida
        do{
            System.out.println(cuenta);
            cuenta = cuenta + 0.2;
        }while(cuenta <= 16.2);
    }
}
