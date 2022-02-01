/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

/**
 *
 * @author Santiago Espinoza
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\t---Generación de 10 números aleatorios entre 0 y 1 (Decimales)---\n");
        
        for(int i=1; i<=10; i++){
            System.out.println(Math.random());
        }
        
        System.out.println("\t---Generación de 10 números aleatorios entre 0 y 10(Decimales)---\n");
        
        for(int i=1; i<=10; i++){
            System.out.println(Math.random()*10);
        }
        
        System.out.println("\t---Generación de 10 números aleatorios entre 0 y 10(Enteros)---\n");
        
        for(int i=1; i<=10; i++){
            System.out.println((int)(Math.random()*10));
        }
        
        System.out.println("\t---Generación de 10 números aleatorios entre 1 y 50(Enteros)---\n");
        
        for(int i=1; i<=10; i++){
            
            int numR = (int)(Math.random()*50+1);
            System.out.println(numR);
        }
        
    }
    
}
