/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de Variables
        int h24, m24, h12, m12;
        String periodo;
        
        h24 = 0; m24 = 0; h12 = 0; m12 = 0;
        periodo = "a.m";
        
        //Ingreso de los DAtos
        System.out.println("Conversión de hora de 24 horas a 12 horas \n");
        System.out.println("Ingrese la hora en formato 24H: ");
        h24 = leer.nextInt();
        System.out.println("Ingrese los minutos en formato 24M: ");
        m24 = leer.nextInt();
        
        //Proceso
        if (((h24 <= 24) && (h24 >= 0)) && ((m24 >= 0) && (m24 <= 60))){
            if (m24 == 60) {
                h24 = h24 +1;
                m24 = 0;
            }
            else {
                m12 = m24;
            }
            if (h24 > 12){
                
                h12 = h24 - 12;
                periodo = "p.m";
                System.out.println("El tiempo de " +h24 +" horas y " +m24 +" minutos \n" + 
                            "equivale a " +h12 +" horas y " +m12 +" minutos" +periodo);
            }
            else {
                h12 = h24;
                System.out.println("El tiempo de " +h24 +" horas y " +m24 +" minutos \n" + 
                            "equivale a " +h12 +" horas y " +m12 +" minutos " +periodo);
            }
        }
        else {
            System.out.println("Error: la hora o los minutos ingresados no son validos");
        }
    }
}
