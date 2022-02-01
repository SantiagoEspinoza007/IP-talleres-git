/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;
import java.io.*;
import java.io.FileNotFoundException;
/**
 *
 * @author Santiago Espinoza
 */
public class Lab7 {
    public static void main(String[] args) {
        
        try{
            
            BufferedReader br = new BufferedReader (new FileReader("D:\\Datos\\Documents\\filename.txt"));
            
            String linea = "";
            
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            
        }catch(FileNotFoundException fnfe){ //No se encuentra el archivo
            System.out.println("No se encuentra el archivo");
        }
        catch(IOException ioe){ // error en la lectura del archivo
            System.out.println("No se puede leer el archivo");
        }
    }
}
