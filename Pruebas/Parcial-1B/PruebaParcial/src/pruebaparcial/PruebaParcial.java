/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaparcial;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class PruebaParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las variables
        double n;
        n = 0;
        
        //Entrada de Datos
        System.out.println("Condicionales que cualifiquen la nota de un alumno");
        System.out.println("Ingrese la nota del alumno: ");
        n = leer.nextDouble();
        
        //Proceso y Salida
        if (n >= 3.0){
            if ((n >= 4.6)||(n <= 5.0)){
            System.out.println("Estudiante Excelente");
            }
            else{
                if ((n >= 4.1)||(n <= 4.5)){
                    System.out.println("El Alumno es Muy Bueno");
                }
                else {
                    if ((n >= 3.6)||(n <= 4.0)){
                        System.out.println("El estudiante es Bueno");
                    }
                    else {
                        if ((n >= 3.3)||(n <=3.5)){
                            System.out.println("El alumno registró un desempeño Aceptable");
                        }
                        else {
                            if ((n >= 3.0)||(n <= 3.2)) {
                                System.out.println("Alumno Aprobado");
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("El alumno registra una calificación no aprobatoria");
        }
    }
}
