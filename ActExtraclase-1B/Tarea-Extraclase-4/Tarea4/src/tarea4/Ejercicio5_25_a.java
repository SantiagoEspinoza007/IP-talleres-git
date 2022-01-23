/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_25_a {
    public static void main(String[] args) {
        //25. Determine el valor de la variable total despu´es que se ejecuta cada uno de los siguientes ciclos
        
      // a)
        //Declaración e Inicialización de las Variables
        int  total, i;
        total = 0; i = 1;
        //Proceso y salida
        do{
            total = total + 1;
            i = i + 1;
            System.out.println(total);
        }while(i<=10);
    }
}
