/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crepetitivos;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class NumMayorDW {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración e Inicialización de las Variables
        int i, n, num, mayor, menor;
        i = 1; n = 0; num = 0; mayor = 0; menor = 0;
        
        //Ingrese los Datos
        System.out.println("Encontrar el número mayor de N números que ingrese el usuario. \n");
        System.out.println("Ingrese el límite de los  números: ");
        n = leer.nextInt();
        
        do {
            System.out.println("\n Ingrese un número: ");
            num = leer.nextInt();
            if (num > mayor){
                mayor = num;
            }
            i = i + 1;
        }while(i<=n);
        
        System.out.println("El número mayor de los valores ingresados es: " +mayor);
        
        System.out.println("\n***Encontrar el número menor de N números que ingrese el usuario***");
        
        for (i =1; i<=n; i++){
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            
            if (i==1){
                menor = num;
            }
            System.out.println("**menor <-- " +menor);
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("El número menor de los valores ingresados es: " +menor);
    }
}
