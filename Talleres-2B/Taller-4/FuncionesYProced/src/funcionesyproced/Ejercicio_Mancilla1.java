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
public class Ejercicio_Mancilla1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int i, j, n;
        n = 0;
        
        System.out.println("\t----Programa para calcular el cuadrado de los números ingresados en un vector----");
        
        System.out.println("¿Cuántos números va a ingresar en el vector?");
        n = leer.nextInt();
        
        int V []= new int [n];
        for (i = 0; i<n; i++){
            System.out.print("Ingrese el número a almacenar en la posición V[" +i +"]: ");
            V[i] = leer.nextInt();
        }
        int C [] = new int [n];
        for (i=0; i<n; i++){
            C[i] = Cuadrado_Suc(V[i]);
        }
        for (i=0; i<n; i++){
            System.out.println("El número contenido en la posición V[" +i +"] tiene como cuadrado " +C[i]);
        }
        
        
    }
    public static int Cuadrado_Suc(int m){
        int r, j;
        r = 0; j = m;
        do{
            r = r + m;
            j = j - 1;
        }while(j > 0);
        return r;
    }
}
