/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_25_e {
    public static void main(String[] args) {
        // e)
        
        //Declaración e Inicialización de las Variables
        int  total, icnt;
        total = 1; icnt = 1;
        
        //Proceso y salida
        do{
            total = total * icnt;
            icnt = icnt + 1;
            System.out.println(total);
        }while(icnt<=8);
    }
}
