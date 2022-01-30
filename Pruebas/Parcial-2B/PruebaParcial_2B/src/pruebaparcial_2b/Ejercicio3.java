/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaparcial_2b;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t---Comparar 2 Matrices---");
        int i, j, k, sumaA, sumaB;
        double promA, promB;
        promA = 0; promB = 0; sumaA = 0; sumaB = 0;
        
        int [][] A = new int [5][5];
        int [][] B = new int [5][5];
        System.out.println("Ingrese los elementos de la matriz A: ");
        for (i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                System.out.print("A[" +i +"] [" +j +"] = ");
                 A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la matriz B: ");
        for (i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                System.out.print("B[" +i +"] [" +j +"] = ");
                 B[i][j] = leer.nextInt();
            }
        }
        for (i= 0; i<5; i++ ){
            for (j = 0; j<5; j++){
                if((i+j)== 4){
                    sumaA = sumaA + A[i][j];
                    sumaB = sumaB + B[i][j];
                }
            }
        }  
        promA = sumaA / 5;
        promB = sumaB / 5;
        double PDA = (sumaA / 5) % 1;
        double PDB = (sumaB / 5) % 1;
        double P_a = promB - PDA;
        double P_b = promB - PDB;
        
        if(P_a == P_b){
            System.out.println("El promedio entero de los elementos de la "
                    + "diagonal secundaria de la matriz A " +P_a+" y la matriz B " +P_b+" son IGUALES");
        }
        else{
            System.out.println("El promedio entero de los elementos de la "
                    + "diagonal secundaria de la matriz A " +P_a+" y la matriz B " +P_b+" son DIFERENTES");
        }
        
    }
}
