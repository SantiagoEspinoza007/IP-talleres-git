/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatosjava;

/**
 *
 * @author SALAA
 */
public class TiposDatosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***Programa de tipos de datos, operadores y expresiones Java***");
        System.out.println("Introducción a la Programación");
        System.out.println("Edgar Santiago Espinoza Velásquez");
        System.out.println("-----");
        
        //Tipos, operadores y expresiones - Int
        
        int num1 = 16;
        int num2 = 8;
        int num3 = num1 + num2;
        System.out.println("El valor de la variable entera num3 es: " +num3);
        
        //Tipos, operadores y expresiones - Double
        System.out.println("-----");
        double dec1 = 1.5;
        double dec2 = 17.5;
        double dec3 = dec1 * dec2;
        System.out.println("El valor de la variable decimal dec3 es =" +dec3);
        
        //Tipos, operadores y expresiones - Char
        System.out.println("-----");
        char letra1 = 'E';
        char letra2 = 'S';
        System.out.println("Los carácteres son: " +letra1 + letra2);
        
        String nombre, apellido, domicilio, telefono;
        
        //Inicializar los String
        nombre = "Edgar Santiago";
        apellido = "Espinoza Velásquez";
        domicilio = "Loja";
        telefono = "0993034641";
        
        System.out.println("**Presentar variables string**");
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi apellido es: " +apellido);
        System.out.println("Vivo en: " +domicilio);
        System.out.println("Mi número de teléfono es: " +telefono);
        System.out.println("\n");
        System.out.println("Me llamo " +nombre+"" +apellido+ " ,vivo en "
            +domicilio+ " , y mi telefono de casa es "+telefono+"\n");
        
        System.out.print("**Presentar en una sóla linea**");
        
        System.out.printf("Me llamo " +nombre+""+apellido+
                    ",vivo en "+domicilio+ ", y mi telefono de casa es "
            +telefono+"\n");
        
        System.out.println("**Presentar concatenar variables de tipo string** \n");
        
        System.out.println("Me llamo ".concat(nombre).concat("").concat(apellido)
            .concat(" y vivo en ").concat(domicilio)
            .concat(" y mi telefono es ")
            .concat(telefono));
                
    }
    
}
