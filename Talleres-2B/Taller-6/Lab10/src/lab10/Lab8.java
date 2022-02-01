/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;
import java.io.*;
/**
 *
 * @author Santiago Espinoza
 */
public class Lab8 {
    public static void main(String[] args) {
        
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/Datos/Documents/colores.txt"));
            
            bw.write("rojo\n");
            bw.write("amarillo\n");
            bw.write("azul\n");
            bw.write("verde\n");
            
            bw.close();
            
        }
        catch(IOException ioe){ // error en la lectura del archivo
            System.out.println("No se puede escribir el archivo");
        }
        
        try{
            
            BufferedReader br = new BufferedReader (new FileReader("D:/Datos/Documents/colores.txt"));
            
            String linea = "";
            
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }
        catch(FileNotFoundException fnfe){ //No se encuentra el archivo
            System.out.println("No se encuentra el archivo");
        }
        catch(IOException ioe){ // error en la lectura del archivo
            System.out.println("No se puede leer el archivo");
        }
        
    }
}
