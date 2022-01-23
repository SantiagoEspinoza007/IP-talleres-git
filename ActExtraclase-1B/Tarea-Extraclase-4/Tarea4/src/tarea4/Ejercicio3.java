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
public class Ejercicio3 {
    public static void main(String[] args) {
    //Realice un algoritmo para leer las calificaciones de N alumnos y determine el número de 
    //aprobados y reprobados. 
        Scanner leer = new Scanner(System.in);
        //Declaración e Inicialización de las variables
        
        int i, n, apro, repro;
        double calif;
        
        i = 1; n = 0; apro = 0; repro = 0; calif = 0;
        
        //Entrada de Datos
        System.out.println("Ingrese el número de estudaintes a verificar: ");
        n = leer.nextInt();
        
        //Proceso
        do{
            System.out.println("Ingrese la calificación del estudiante: ");
            calif = leer.nextDouble();
            
            if ((calif > 6.99) && (calif <= 10)){
                System.out.println("Estudiante Aprobado \n");
                apro = apro + 1;
            }
            else {
                if ((calif > 0) && (calif <= 6.99)){
                    System.out.println("Estudiante Reprobado \n");
                    repro = repro + 1;
                }
                else {
                    System.out.println("La nota ingresada es erronea");
                }
            }
            calif = 0;
            i= i + 1;
        }while(i<=n);
        System.out.println("Estudiantes Aprobados: " +apro);
        System.out.println("Estudiantes Reprobados: " +repro);
    }
}
