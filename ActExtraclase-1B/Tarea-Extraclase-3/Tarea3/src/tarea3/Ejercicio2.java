/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea3;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        //Declaración e Inicialización de Variables 
        int d_nacim, m_nacim, a_nacim, d_actu, m_actu, a_actu,  
                d_resul, m_resul, a_resul, opc;
        
        d_nacim = 0; m_nacim = 0; a_nacim = 0;
        d_actu = 0; m_actu = 0; a_actu = 0;
        d_resul = 0; m_resul = 0; a_resul = 0;
    
        //Entrada de Datos
        System.out.println("Programa para calcular la edad de una persona en días,  "
                + "meses y años");
        System.out.println("Ingrese la Fecha De Nacimiento");
        System.out.println("Día de Nacimiento: ");
        d_nacim = leer.nextInt();
        System.out.println("Mes de Nacimiento: ");
        m_nacim = leer.nextInt();
        System.out.println("Año de Nacimiento: ");
        a_nacim = leer.nextInt();
        System.out.println("Ingrese la Fecha Actual");
        System.out.println("Dia Actual: ");
        d_actu = leer.nextInt();
        System.out.println("Mes Actual: ");
        m_actu = leer.nextInt();
        System.out.println("Año Actual: ");
        a_actu = leer.nextInt();
        
        //Proceso y Salida
    	a_resul = (a_actu - a_nacim);
        if (m_actu >= m_nacim){
            m_resul = (m_actu - m_nacim);
        }
        else {
            m_resul = ((m_actu + 12)-m_nacim);
            a_resul = (a_resul - 1);
        }
        if (d_actu >= d_nacim) {
            d_resul = (d_actu - d_nacim);
        }
        else{
            System.out.println("1. El mes de nacimiento tiene 30 días");
            System.out.println("2. El mes de nacimiento tiene 31 días");
            System.out.println("3. El mes de nacimiento tiene 28 días");
            System.out.println("Ingrese una opción según corresponda al mes de nacimiento");
            opc = leer.nextInt();
            switch (opc) {
                case 1 :{
                    d_resul = 30;
                }
                break;
                case 2 :{
                    d_resul = 31;
                }
                break;
                case 3 :{
                    d_resul = 28;
                }
                break;
                default: 
                    System.out.println("La opción ingresada es erronea");
                break;
            }
            d_resul = ((d_resul - d_nacim) + d_actu);
            m_resul = (m_resul - 1);
        }
        System.out.println("Tienes " +a_resul +" años, " +m_resul +" meses y " +d_resul +" días.");
    }
}
