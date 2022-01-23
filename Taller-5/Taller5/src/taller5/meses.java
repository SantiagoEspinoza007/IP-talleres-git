/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class meses {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de Variables
        int meses;
        
        //Ingreso de los Datos
        System.out.println("Identificador de Meses \n");
        
        System.out.println("Ingrese el número del mes a identificar: ");
        meses = leer.nextInt();
        
        //Proceso y Salida
        
        switch (meses){
            case 1: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a enero");
            }
            break;
            case 2: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a febrero");
            }
            break;
            case 3: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a marzo");
            }
            break;
            case 4: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a abril");
            }
            break;
            case 5: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a mayo");
            }
            break;
            case 6: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a junio");
            }
            break;
            case 7: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a julio");
            }
            break;
            case 8: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a agosto");
            }
            break;
            case 9: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a septiembre");
            }
            break;
            case 10: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a octubre");
            }
            break;
            case 11: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a noviembre");
            }
            break;
            case 12: {
                System.out.println("El número del mes ingresado: " +meses +" corresponde a diciembre");
            }
            break;
            default: 
                System.out.println("El número de mes ingresado es incorrecto");
                break;
        }
        
    }
}
