/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1.java;
import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Tarea1Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        double tra;
        double lec;
        double parti;
        double exa_f;
        double a;
        double b;
        double c;
        double d;
        double total;
        String nombre;
        
        //Ingreso de Datos
        
        System.out.println("----Programa para calcular la nota final de un estudiante----");
        System.out.println("Ingrese el nombre del estudiante");
        nombre = leer.next();
        
        //Entrada de Datos
        
        System.out.println("Ingrese la nota de trabajos sobre 10");
        tra = leer.nextDouble();
        
        System.out.println("Ingrese la nota de lecciones sobre 10");
        lec = leer.nextDouble();
        
        System.out.println("Ingrese la nota de participaciones sobre 10");
        parti = leer.nextDouble();
        
        System.out.println("Ingrese la nota del examen final sobre 10");
        exa_f = leer.nextDouble();
        
        //Proceso
        
        a = ((tra * 20)/100);
        b = ((lec * 30)/100);
        c = ((parti * 10)/100);
        d = ((exa_f * 40)/100);
        
        total = (a + b + c + d);
        
        //Salida de Datos
        
        System.out.println("La nota final del estudiante es:" +total +"\n ");


    }
}
