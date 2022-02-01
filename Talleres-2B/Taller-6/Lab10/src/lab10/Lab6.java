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
public class Lab6 {
    public static void main(String[] args) {
        try{
            String ruta = "D:/Datos/Documents/filename.txt";
            String contenido = "Archivo de prueba";
            File file = new File(ruta);
            //Si el archivo no existe es creado
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
