/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class SelectorPersonal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\t----PROGRAMA PARA SELECCIONAR PERSONAL----");
        //Declaración e Inicialización de las variables
        int n, m, i, j, k;
        double total, mayor, aux;
        n = 0; m = 0; i = 0; j = 0; k = 0; total = 0; mayor = 0; aux = 0;
        
        // Ingresar los datos
        System.out.println("¿Cuántos trabajadores va a evaluar?");
        n = leer.nextInt();
        System.out.println("¿Cuántos criterios va a evaluar?");
        k = leer.nextInt();
        System.out.println("¿Cuántos aspirantes desea obtener?");
        m = leer.nextInt();
        
        // Declarar el vector 
        String [] A = new String [n];
        
        // Ingresar los datos del vector
        for (i = 0; i<n ; i++) {
            System.out.print("Ingrese el nombre del trabajador " +i +": ");
            A[i] = leer.next();
        }
        
        // Declaración e Ingreso de datos a la matriz
        int [][] C = new int [n][k];
        int bandera = 0;
        for (i = 0; i<n ; i++) {
            System.out.println("\n\tCalificación criterios de "+A[i]);
            for (j = 0; j<k ; j++) {
                System.out.print("Ingrese la calificación del criterio " +j +" de " +A[i] +": ");
                C[i][j] = leer.nextInt();
                if (C[i][j]<0 || C [i][j] > 10){
                    bandera = 1;
                }
            }
        }
        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                if (C[i][j]<0 || C [i][j] > 10){
                    bandera = 1;
                }
            }
        }
        if (bandera == 1){
            System.out.println("El valor asignado al criterio es incorrecto");
        }
        else {
            if (bandera == 0){
                
                // Declarar el arreglo de media
                 double [] Media = new double [n];
                System.out.println("\n\tCalificación Media de los trabajadores");
                for (i = 0; i<n ; i++) {
                    for (j = 0; j<k ; j++) {                
                        total = total + C[i][j];
                        Media[i] = total/k;
                    }
                    System.out.println(A[i]+": "+Media[i]+"   ");
                    total = 0;
                }
        
                // Ordenar el vector media
                for (i = 0; i<n ; i++) {
                    for (j = i + 1; j<k ; j++) {
                        if (Media[i]>Media[j]) {
                            mayor = Media[i];
                        }
                    }
                }        
        
                // Seleccionar los aspirantes para n puestos
                double [] Selec = new double [m];
                for (i = 0; i<n ; i++) {
                    for (j = 0; j<k ; j++) {
                        if (Media [i] > Media[j]) {
                            aux = Media[i];
                            Media [i] = Media[j];
                            Media [j] = aux;                    
                        }
                    }
                }
                System.out.println("\nLos "+m+" aspirantes seleccionados para el puestos de trabajo son: ");
                for (i = 0; i<m; i++) {
                System.out.println(A[i]+" con una media de: "+Media[i]);
                }
            }
        }
    }   
}
