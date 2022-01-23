/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crepetitivos;
/**
 *
 * @author SALAA
 */
public class Multiplos5 {
    public static void main(String[] args) {
        System.out.println("Proceso lógico repetitivo for");
        //Declaración e Inicialización de las Variable
        int i;
        int n=100;
        
        //Proceso
        for(i=0; i<=n; i= i+5){
            System.out.println(i);
        }
        System.out.println("\nProceso lógico repetitivo do while");
        //Declaración e Inicialización de las Variables
        i = 0;
        n = 100;
        
        //Proceso
        do{
            System.out.println(i);
            i = i + 5;
        }while (i<=n);
    }
}
