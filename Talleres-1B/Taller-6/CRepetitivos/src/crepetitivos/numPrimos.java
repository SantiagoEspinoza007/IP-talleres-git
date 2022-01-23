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
public class numPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int i, n, num;
        int j, divisor;
        
        n=0; num=0; divisor=0;
        //Ingreso de Datos
        System.out.println("Ingrese el límite: ");
        n = leer.nextInt();
        
        for (i=1; i<=n; i++){
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            
            //Verificar si un número es par o impar
            if (num % 2 ==0){
                System.out.println("El número " +num +" es PAR \n");
            }
            else{
                System.out.println("El número " +num +" es IMPAR \n");
            }
            
            //Verificar si un número es primo
            j = 1;
            while (j<=num){
                if (num % j==0){
                    divisor = divisor + 1;
                }
                j = j+1;
            }
            if (divisor ==2){
                System.out.println("El número " +num +" es Primo \n");
            }
            else {
                System.out.println("El número " +num +" no es Primo \n");
            }
            divisor = 0;
        }
    }
}

