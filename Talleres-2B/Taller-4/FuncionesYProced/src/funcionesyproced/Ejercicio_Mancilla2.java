/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproced;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio_Mancilla2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Lee la matriz de orden 3
        int i,j;
        double [][] M = new double[3][3];
        double det;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("ingrese el valor de M["+i+"]["+j+"]= ");
                M[i][j]= leer.nextDouble();
            }
            det = Sarrus(M);
            System.out.println("El determinante de la matriz es igual a: "+det);           
        }        
    }
    public static double Sarrus(double [][]M){
        int i, j, t, dc, n, m, k;
        double A[][] = new double [3][5];
        double d, sumad, z, sumai, det;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                A[i][j] = M[i][j];
            }        
        }
        // Comlumnas adicionales de la matriz ampliada
        for (i = 0; i < 3; i++) {
            for (j = 3; j < 5; j++) {
                A[i][j] = A[i][j-3];
            }        
        }
        //calculo del determinante
        i = 1;j = 1;k = 0; dc = 1;t = 3;d = 1;sumad = 0;
        while(k<3){
            while((j<t)&&(t<=5)){
                d = d * A[i][j];
                System.out.println("D = " +d);
                i = i + 1;
                j = j + 1;
            }
            sumad = sumad + d;
            System.out.println("---Suma D [" +i+ "] = " +sumad);
            d = 1;
            i = 0;
            k = k + 1;
            dc = dc + 1;
            j = dc;
            t = t + 1;
        }
        i = 0; j = 2;k = 0; dc = 2; k = 0; t = 0; z = 1;sumai = 0;
        while(k<3){
            while((j>=t)&&(t<3)){
                z = z * A[i][j];
                i = i + 1;
                j = j - 1;
                System.out.println("Z = " +z);
            }
            sumai = sumai + z;
            System.out.println("--- Suma I [" +i+"] = " +sumai);
            z = 1;
            i = 0;
            k = k + 1;
            dc = dc + 1;
            j = dc;
            t = t + 1;
        }
        System.out.println("sumad = "+sumad+ " - sumai = "+sumai);
        det = sumad - sumai;
        return det;
    }
}
