/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //Declaración e Inicialización de las Variables
        
        int i, suma;
        i = 1; suma = 0;
        
        //Proceso
        do {
            if ((i%3==0)||(i%5==0)){
                suma = suma + i;
            }
            i = i + 1;
        }while(i<=999);
        System.out.println("Total: " +suma);
    }
}
