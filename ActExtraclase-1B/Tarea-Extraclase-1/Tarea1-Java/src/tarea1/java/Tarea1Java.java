/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1.java;
import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Tarea1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double min_llama;
        double cos_min;
        double valor_total;
        String nombre;
        
        //Ingreso de Datos
        
        System.out.println("----Programa para calcular el costo total de una llamada----");
        System.out.println("Ingrese el nombre de usuario");
        nombre = leer.next();
        
        //Entrada de Datos
        
        System.out.println("Ingrese los minutos que dura la llamada");
        min_llama = leer.nextDouble();
        
        System.out.println("Ingrese el costo por minuto de una llamada");
        cos_min = leer.nextDouble();
        
        //Proceso
        
        valor_total = min_llama * cos_min;
        
        //Salida de Datos
        
        System.out.println("El costo total de la llamada es:" +valor_total +"\n");
    }
    
}
