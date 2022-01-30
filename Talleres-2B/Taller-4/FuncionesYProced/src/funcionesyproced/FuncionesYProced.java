/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesyproced;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class FuncionesYProced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("\tProcedimiento para verificar si un número es Par o Impar");
        System.out.println("\nIngrese el número a verificar ");
        num = leer.nextInt();
        
        ParImpar(num);
        
        System.out.println("\n\t---FIN DEL PROCEDIMIENTO 1---");
        
        NegPos(num);
        
        System.out.println("\n\t---FIN DEL PROCEDIMIENTO 2---");
    }
    
    //Procedimiento para verificar si un número es Par o Impar
    public static void ParImpar (int numero){
        
        if (numero % 2 == 0){
            System.out.println("\nEl número " +numero +" es par");
        }
        else{
            System.out.println("\nEl número " +numero +" es impar");
        }
    }
    
    public static void NegPos(int numero) {
        if (numero > 0){
            System.out.println("\n El número " +numero +" es positivo");
        }
        else{
            System.out.println("\nEl número " +numero +" es negativo");
        }
    }
    
    
}
