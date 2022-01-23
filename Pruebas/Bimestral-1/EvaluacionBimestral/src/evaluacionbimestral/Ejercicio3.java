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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("****SERIE NUMÉRICA****");        
        //Declaración e Inicialización de las Variables
        int pot, i, n, mult3, j;
        double num, numc, denom, sumando, suma;
        
        num = 1; numc = 0; denom = 7; pot = 2; suma = 0; sumando = 0; i = 1; n = 0; mult3 = 3;
        
        //Ingreso del límite de la serie
        System.out.println("Ingrese el límite de la serie: ");
        n = leer.nextInt();
        
        //Proceso y Salida
        numc = num;
        for (i = 1; i<= n; i ++){
            System.out.println(numc +"^" +pot +"/" +denom);
            
            if (i % 2 == 0){
                numc = 1;
                num = 1;
            }
            else{
                numc = 2;
                num = 2;
            }
            pot = pot + 2;
            for (j = 2; j <= pot; j++){
                num = num * 2;
            }
            if (i == 1){
            denom = denom + 3;
            }   
            else{
                mult3 = mult3 + 3;
                denom = denom + mult3;
            }
            
            sumando = num/denom;
            suma = suma + sumando; 
        }
        System.out.println("La suma total de la serie es: " +suma);
    }
}
