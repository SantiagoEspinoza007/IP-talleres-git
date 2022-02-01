/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;
import java.util.ArrayList;
/**
 *
 * @author Santiago Espinoza
 */
public class Lab4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        //números de elementos de la lista
        
        System.out.println("La lista tiene " +nombres.size() + " elementos");
        
        //agragar elementos a la lista
        
        nombres.add("Anita");
        nombres.add("Kevin");
        nombres.add("Edgar");
        nombres.add("Diego");
        nombres.add("David");
        nombres.add("Bryam");
        nombres.add("Justin");
        
        System.out.println("La lista tiene " +nombres.size() + " elementos");
        
        //Retornar el elemento dentro de la lista
        
        System.out.println("Elemento en la posición 2 " +nombres.get(2));
        
        System.out.println("Elemento en la posición 0 " +nombres.get(0));
        
        System.out.println("\nlos elementos de la lista son: ");
        for(int i = 0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        
        System.out.println("\nlos elementos de la lista son: (for simplificado)");
        
        for (String name: nombres){
            System.out.println(name);
        }
    }
}
