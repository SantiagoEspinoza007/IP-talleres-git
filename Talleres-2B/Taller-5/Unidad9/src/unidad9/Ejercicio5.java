/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad9;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese el valor 1");
            int valor1 = leer.nextInt();
            
            System.out.println("Ingrese el valor 2");
            int valor2 = leer.nextInt();
            
            if(valor1 < 0 || valor2 < 0){
                
                throw new Exception("ERROR: No se permite ingresar número negativos");
            }
            double result = valor1/valor2;
            
            System.out.println("El resultado es: " +result);
        }
        catch(Exception e){
            
            System.out.println("Ha ocurrido una excepción de tipo: "+e);
        }
    }
}
