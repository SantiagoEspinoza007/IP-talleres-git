/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Lab2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t---Generar un día de la semana aleatoriamente---\n");
        
        int dia = (int)(Math.random() * 7) + 1;
        
        System.out.println(dia);
        
        switch(dia){
            
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> {  
            }
        }
    }
}
