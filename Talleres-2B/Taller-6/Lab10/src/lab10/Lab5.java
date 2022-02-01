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
public class Lab5 {
    public static void main(String[] args) {
        
        ArrayList<String> dias = new ArrayList<String>();
        
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        
        System.out.println("Tamaño Lista Días: " +dias.size()+ " elementos");
        
        System.out.println("\nDías de la semana");
        
        for(String dia : dias){
            System.out.println(dia);
        }
        
        //Buscar y obtener un elemento de la lista
        
        if(dias.contains("Friday")){
            System.out.println("\nEs el quinto día del mes");
        }
        else{
            System.out.println("\nNo existe el elemento en la lista");
        }
        
        //Remover un elemento de la lista
        dias.remove("Martes");
        
        System.out.println("\nDías de la semana despues de remover ---Martes---");
        
        for(String dia : dias){
            System.out.println(dia);
        }
        
        //Tamaño de la lista
        System.out.println("\nTamaño Lista Días: " +dias.size()+ " elementos");
        
        dias.remove(5);
        System.out.println("\nDías de la semana despues de remover el elemento de la posición 5");
        
        for(String dia : dias){
            System.out.println(dia);
        }
        
        //Tamaño de la lista
        System.out.println("\nTamaño Lista Días: " +dias.size()+ " elementos");
        
        //Modificar la lista
        
        System.out.println("\nModificar el elemento de la posición 3");
        dias.set(3, "Friday");
        
        for(String dia : dias){
            System.out.println(dia);
        }
        
        //Tamaño de la lista
        System.out.println("\nTamaño Lista Días: " +dias.size()+ " elementos");
        
        //Agregar un elemento a la lista
        System.out.println("\nAgregar un elemento en la posición 1");
        dias.add(1, "Martes");
        
        for(String dia : dias){
            System.out.println(dia);
        }
        
        //Tamaño de la lista
        System.out.println("\nTamaño Lista Días: " +dias.size()+ " elementos");
        
    }
}
