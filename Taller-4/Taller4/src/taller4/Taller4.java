/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("**Programa para calcular el área de un poligono compuesto**  \n");
        
        //Declarar e Inicializar las variables
        
        double lc, at, ar, A, B, D;
        double ats, area;
        
        lc =0; at =0; ar =0; A =0; B =0; D =0;
        ats =0; area =0;
        
        //Ingresar los Datos
        
        System.out.println("Ingrese el lado del cuadrado");
        lc = leer.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        at = leer.nextDouble();
        System.out.println("Ingresar la altura del rectángulo");
        ar = leer.nextDouble();
        
        //Proceso
        A = Math.pow(lc, 2);
        B = (lc * at)/2;
        ats = (B * 3);
        D = lc * ar;
        area = A + ats + B;
        
        //Salida
        System.out.println("El área total del poligono compuesto es: " +area +" con un cuadrado" 
                    + " de area " +A +" con tres triángulos rectángulos de área " 
                    +ats +" y un " + "rectángulo de área " +D +"\n");
    }
    
}
