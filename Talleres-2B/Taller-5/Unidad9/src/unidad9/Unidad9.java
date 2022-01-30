/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad9;
/**
 *
 * @author Santiago Espinoza
 */
public class Unidad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int nota1 = 9;
            int nota2 = 0;
            int notaFinal = nota1/nota2;
            System.out.println("La nota final es: "+notaFinal);
        }
        catch(ArithmeticException ExpresionAritmetica){
            System.out.println("Lo sentimos, hay un error ");
            System.out.println("de tipo: "+ExpresionAritmetica);
        }
    }
    
}
