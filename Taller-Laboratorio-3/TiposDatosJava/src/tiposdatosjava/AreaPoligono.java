/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatosjava;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class AreaPoligono {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    double A;
    double B;
    double C;
    double alTriag;
    double areaT, areaR, areaTotal;
    String nombre;
    
        System.out.println("***Programa para calcular el área de un polígono*** \n");
        System.out.println("Ingrese el nombre del usuario: ");
        nombre = leer.next();
    //Ingresar datos
        System.out.println("Ingresa la altura del terreno (A): ");
        A = leer.nextDouble();
        System.out.println(A);
        
        System.out.println("Ingresa la base del terreno (B): ");
        B = leer.nextDouble();
        
        System.out.println("Ingresa la altura del rectángulo del terreno (C): ");
        C = leer.nextDouble();
        
        //Proceso
        alTriag = A - C;
        areaT = (B * alTriag)/2;
        areaR = B * C;
        areaTotal = areaT + areaR;
        
        System.out.println("El área del triangulo del terreno es: " +areaT + "\n");
        System.out.println("El área del rectángulo del terreno es: " +areaR + "\n");
        System.out.println("El área total del terreno es: " +areaTotal + "\n");
    }
        
}
