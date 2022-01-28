/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerlab2b1s;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class TallerLab2B1S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declararación e Inicialización 
        int i, n;
        double suma, promed, mayor; 
        i=1; n = 0;
        suma = 0; promed = 0; mayor = 0;
        
        System.out.println("Ingrese el número de notas a promediar: ");
        n = leer.nextInt();
        
        double [] NOTAS = new double [n];
        String [] Nombres = new String [n];
        
        //Ingreso de las notas
        for (i = 0; i< n; i++){
                
            System.out.println("Ingrese el nombre " +i +":");
            Nombres[i] = leer.next();
            System.out.println("Ingrese la nota de " +Nombres[i]);
            NOTAS[i] = leer.nextDouble();
            
        }
        
        System.out.println("\n");
        
        //Calcular la suma de las notas
        for(i=0; i<n; i++){
            
            suma = suma + NOTAS[i];
            
        }
        
        //Promedio de las notas ingresadas
        promed = suma / (n - 1);
        
        //Presentar los elementos del vector
        for (i=0; i<n; i++){
            
            System.out.println("Notas [" +i +"] = " +NOTAS[i]);
            
        }
        System.out.println("\n");
        System.out.println("El promedio de las notas es: " +promed);
        
        //Obtener la nota más alta
        mayor = NOTAS[0];
        for (i = 1; i<=n; i++){
            
            if(NOTAS[i]>mayor){
                mayor = NOTAS[i]; 
            }
            System.out.println("--- Nota Mayor = " +mayor);
            
            for (i=0; i<n; i++){
                
                if ( i % 2 != 0){
                    
                    System.out.println("Notas [" +i +"] = " +NOTAS[i]);
                    
                }   
            }
            
            System.out.println("\n NOTAS Y NOMBRES DE ESTUDIANTES");
            
            for (i = 0; i<n; i++){
                
                System.out.println(Nombres[i]+" tiene una nota de " +NOTAS[i]);
                
            }       
        }
    }
}
