/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.java;

import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración e Inicialización de variables
        int i, num;
        i = 0; num = 0;
        System.out.println("\t---Contar los números terminados en 3 de un vector---");
        int [] A = new int [10];
        //Ingreso de los elementos del vector
        System.out.println("Ingrese los elementos del vector");
        for(i=0; i<10; i++){
                System.out.print("Ingrese el elemento A["+i+"] = ");
                A[i] = leer.nextInt();
        }
        num = Buscar_Numeros(A); //Se llama a la función Buscar_Numeros
        System.out.println("En el vector ingresado se han encontrado "+num+" números terminados en 3.");
        
    }
    public static int Buscar_Numeros(int [] A){
        //Declaración e Inicialización de variables
        int num, i;
        num = 0;
        //Proceso para contar los números terminados en 3 
        for (i=0; i<10; i++){
            if (A[i] % 10 == 3){
                num = num + 1;
            }
        }
        return num;
    }
}
