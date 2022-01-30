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
public class Ejercicio_Mancilla3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int k, n, i, j, q, g, rd;
        int Disp[][] = new int [50][50];
        System.out.print("Ingrese el valor de k: ");
        k = leer.nextInt();
        System.out.print("Ingrese el valor de n: ");
        n = leer.nextInt();
        
        for (i = 0; i < k; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Ingrese el valor de Disp["+i+"]["+j+"]= ");
                Disp[i][j]=leer.nextInt();
                
            }
        }
        
        // Se hace el chequeo de la disponibilidad
        // del anaquel q en la gondola g
        System.out.print("Ingrese el valor de q: ");
        q = leer.nextInt();
        System.out.print("Ingrese el valor de g: ");
        g = leer.nextInt();
        rd = FunDisp(Disp,g,q);
        if(rd==0){
            System.out.println("El anaquel "+q+" en la gondola "+g+" está disponible");
        }
        else{
            System.out.println("El anaquel "+q+" en la gondola "+g+" no está disponible");
        }
        
    }
    public static int FunDisp(int [][]Disp,int g, int q){
        if(Disp[g][q]==0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
