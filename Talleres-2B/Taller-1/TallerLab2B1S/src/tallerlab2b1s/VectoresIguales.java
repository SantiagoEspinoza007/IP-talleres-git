/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlab2b1s;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class VectoresIguales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\t ----DETERMINAR SI DOS VECTORES SON IGUALES EN CONTENIDO Y POSICIÓN----\n");
        //Declaración e inicialización de las Variables 
        int i, j, ba;
        i = 0; j = 0; ba = 0;
        
        //Declaración de los vectores
        int [] A = new int [5];
        int [] B = new int [5];
        
        //Ingresar los datos del vector base
        for (i=0; i<5; i++){  
            System.out.println("Ingrese el elemento A[" +i +"]: ");
            A[i]= leer.nextInt();
        }
        for (i=0; i<5; i++){
            System.out.println("Ingrese el elemento B[" +i +"]: ");
            B[i]= leer.nextInt(); 
        }
        
        //Proceso
        for (i=0; i<5; i++){
            if (A[i] != B[i]){
               ba =1; 
            }
        }
        if (ba==1){
            System.out.println("Los vectores A y B no son iguales");
        }
        else{
            if (ba == 0){
                System.out.println("Los vectores A y B son iguales");
            }
        }
    }
}
