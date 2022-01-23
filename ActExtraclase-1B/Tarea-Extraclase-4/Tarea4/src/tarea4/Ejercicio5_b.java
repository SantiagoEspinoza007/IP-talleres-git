/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5_b {
    public static void main(String[] args) {
    //b
        //Declaración e Inicialización de las Variables
        int i, j, k;
        i = 3; j = i; k = i;
        
        //Proceso y Salida
        do {
            while (j==i){
                while (k==j){
                    System.out.println(i +" " +j +" " +k);
                    k = k - 1;
                }
                j = j + 1;
            }
            i= i - 1;
        }while(i==1);
    }
}
