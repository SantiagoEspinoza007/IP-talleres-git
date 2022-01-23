/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //Declaración e inicialización de variables
        double metros, cm, km, ft, in_;
        
        metros = 0; cm = 0; km = 0; ft = 0; in_ = 0;
        
        System.out.println("***Programa para convertir una cantidad de metros a "
                + "centimetros, kilometros, pies y pulgadas***");
        //Ingresar los Datos
        System.out.println("Ingrese el valor en metros: ");
        metros = leer.nextDouble();
        
        //Proceso
        cm = (metros * 100);
	km = (metros / 1000);
	ft = (metros * 3.281);
	in_ = (metros * 39.37);
        
        //Salida
        System.out.println("Los metros convertidos en centímetros son: " +cm +" cm");
        System.out.println("Los metros convertidos en kilómetros son: " +km +" km");
        System.out.println("Los metros convertidos pies son: " +ft +" pies");
        System.out.println("Los metros convertidos en pulgadas son: " +in_ +" pulgadas");
        
    }
    
}
