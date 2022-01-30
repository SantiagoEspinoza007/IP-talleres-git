/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaparcial_2b;
import java.util.Scanner;

/**
 *
 * @author Santiago Espinoza
 */
public class PruebaParcial_2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t---Ejercicio 1---");
        int n, i, j;
        n = 0;
        
        System.out.println("¿Cuántos números va a ingresar?");
        n = leer.nextInt();
        
        int [] A = new int [n];
        
        System.out.println("Ingrese los elementos del vector A en la posición: ");
        for (i=0; i<n; i++){
            System.out.print("["+i+"]= ");
            A[i]=leer.nextInt();
        }
        VerificarPar(A, n);
        VerificarNeg(A, n);
        VerificarPrimo(A, n);
    }
    public static void VerificarPar(int [] A, int n){
        int i, j, m;
        double porc;
        m = 0;
        for (i=0; i<n; i++){
            if (A[i] % 2 == 0){
                m = m + 1;
            }
        }
        System.out.println(m);
        int [] PAR = new int [m];
        for(j=0;j<m; j++){
            for (i=0; i<n; i++){
                if (A[i] % 2 == 0){
                    PAR[j]=A[i];
                }
            }
        }
        porc = (m * 100) / n;
        System.out.println("Hay "+m+" números Pares que son el "+porc+"% del total de números");
        
        System.out.print("Par = [");
        for(i=0; i<m;i++){
            System.out.print(+PAR[i]+" ");
        }
        System.out.println("]");
    }
    public static void VerificarNeg (int [] A, int n){
        int i, j, m;
        double porc;
        m = 0; porc = 0;
        for (i=0; i<n; i++){
            if (A[i] < 0){
                m = m + 1;
            }
        }
        int [] NEG = new int [m];
        
        for(j=0;j<m; j++){
            for (i=0; i<n; i++){
                if (A[i] < 0){
                    NEG[j]=A[i];
                }
            }
        }
        
        porc = (m*100)/n;
        System.out.println("Hay "+m+" números Negativos que son el "+porc+"% del total de números");
        System.out.print("Negativos = [");
        for(i=0;i<m;i++){
            System.out.print(+NEG[i]+" ");            
        }        
        System.out.println("]");
    }
    public static void VerificarPrimo(int [] A, int n){
        int i, m, j, divi, k;
        double porc = 0;
        m = 0; j = 0; divi = 0;
        for(i=0; i<n; i++){
            for (j=1; j<=A[i]; j++){
                if (A[i] % j == 0){
                    divi = divi + 1;
                    }
                if (divi == 2){
                    m = m + 1;
                }
            }    
        }
        int [] PRIMOS = new int [m];
        for(k=0;k<m; k++){
            for (i=0; i<n; i++){
                if (A[i] % j == 0){
                    divi = divi + 1;
                }
                if (divi == 2){
                    PRIMOS[k]=A[i];
                }
            }
        }
        porc = (m*100)/n;
        System.out.println("Hay "+m+" números Primos que son el "+porc+"% del total de números");
        System.out.print("PRIMOS = [");
        for(i=0;i<m;i++){
            System.out.print(+PRIMOS[i]+" ");            
        } 
        System.out.println("]");
    }
}