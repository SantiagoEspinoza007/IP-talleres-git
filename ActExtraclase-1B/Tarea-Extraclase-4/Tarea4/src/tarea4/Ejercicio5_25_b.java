/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_25_b {
    public static void main(String[] args) {
        // b)
        
        //Declaración e Inicialización de las Variables
        int  total, cuenta;
        total = 1; cuenta = 1;
        
        //Proceso y salida
        do{
            total = total * 2;
            cuenta = cuenta + 1;
            System.out.println(total);
        }while(cuenta<=10);
    }
}
