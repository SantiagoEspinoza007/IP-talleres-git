/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionbimestral;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("****PROGRAMA PARA MOSTRAR LOS MULTIPLOS DE 3 COMPRENDIDOS ENTRE DOS"
                + " NÚMEROS INGRESADOS**** \n");
        //Declaración e Inicialización de las variables
        int num1, num2, i, n, multiplo;
        num1 = 0; num2 = 0; i = 0; n = 0; multiplo = 0;
        
        //Ingreso de Datos
        System.out.println("Ingrese el primer número entero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        num2 = leer.nextInt();
        
        //Proceso y Salida
        if (num1 > num2){
            n = num1;
            i = num2;
            System.out.println("Los multiplos de 3 comprendidos entre " +num2 +" y " +num1 +" son: \n");
            while(i <= n){
                if(i % 3 == 0){
                    System.out.print(i +" \n");
                }
                i = i + 1;
            }
        }
        else{
            n = num2;
            i = num1;
            System.out.println("Los multiplos de 3 comprendidos entre " +num1 +" y " +num2 +" son: ");
            while(i <= n){
                if(i % 3 == 0){
                    System.out.print(i +" \n");
                }
                i = i + 1;
            }
        }  
    }
}
