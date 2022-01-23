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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int num, numc, suma, digi;
        suma = 0; digi = 0;
        
        //Ingreso del límite
        System.out.println("Ingrese el número entero a analizar: ");
        num = leer.nextInt();
        
        //Proceso
        numc = num;
        if (numc < 0){
            numc = -numc;
        }
        if (numc == 0){
           suma = 0;
           digi = 1;
        }
        else {
            while (numc > 0){
                suma = suma + (numc % 10);
                digi = digi + 1;
                numc = numc / 10;
            }
        }
        System.out.println(num +" tiene " +digi +" dígitos y la suma de los dígitos de "    
                +num +" es: " +suma);
    }
}
