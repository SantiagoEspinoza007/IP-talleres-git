/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaparcial;
import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las variables
        String nC;
        int tipoC;
        double cantL, costoL, subT, descTo, descT1, descT2, descT3,
                    descA1, descA2, descAo, desc, total, descuento;
        
        cantL = 0; costoL = 0; subT = 0; descTo = 0; descT1 = 0.30; descT2 = 0.20; 
        descT3 = 0.10; descA1 = 0.04; descA2 = 0.08; descAo = 0; desc = 0; total = 0;
        descuento = 0;
        //Entrada de datos
        System.out.println("***Descuentos en una Libreria*** \n");
        System.out.println("Ingrese el nombre del cliente: ");
        nC = leer.nextLine();
        System.out.println("Ingrese la cantidad de Libros a comprar: ");
        cantL = leer.nextDouble();
        System.out.println("Ingrese el valor de los libros a comprar: ");
        costoL = leer.nextDouble();
        System.out.println("Seleccione el tipo de cliente al que corresponda: ");
        System.out.println("1. Cliente Tipo: Docente");
        System.out.println("2. Cliente Tipo: Estudiante");
        System.out.println("3. Cliente Tipo: Usuario General");
        System.out.println("Ingrese una Opción: ");
        tipoC = leer.nextInt();
        
        //Proceso y Salida
        subT = cantL * costoL;
        switch (tipoC) {
            case 1:{
                descTo = descT1;
            }
            break;
            case 2:{
                descTo = descT2;
            }
            break;
            case 3:{
                descTo = descT3;
            }
            break;
            default :{
                System.out.println("La opción ingresada es incorrecta: ");
            } 
        }
        if ((cantL > 5) && (cantL < 10)){
            descAo = descA1;
        }
        else{
            if (cantL > 10){
                descAo = descA2;
            }
            else {
                if (cantL < 5) {
                    descAo = 0;
                }
            }
        }
        desc = descTo + descAo;
        descuento = subT * desc;
        total = subT - descuento;
        System.out.println("Estimado cliente: " +nC +" el total a pagar es: " +
                    subT +" dolares, pero usted ha obtenido un descuento de: " +
                    descuento +" dolares entonces el valor neto a pagar es: " +     
                     total +" dolares. \n" +"Gracias por su Compra");
    }
}
