/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionbimestral;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class EvaluacionBimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("****PROGRAMA PARA VERIFICAR SI UN NÚMERO ES PAR O IMPAR, "
                + " POSITIVO O NEGATIVO, MULTIPLO DE 5 O UN NÚMERO PRIMO****");
        //Declaración e Inicialización de las Variables
        int opc, i, j, num, primo;
        opc = 0; i = 1; j = 1; num = 0; primo = 0;
        
        //Proceso y Salida
        System.out.println("¿Cúal es el número a verificar?");
        num = leer.nextInt();
        System.out.println("\n");
        System.out.println("Ingrese del siguiente menú la opción a verificar: ");
        System.out.println("1. Verificar si es par o impar");
        System.out.println("2. Verificar si es positivo o negativo");
        System.out.println("3. Verificar si es multiplo de 5");
        System.out.println("4. Verificar si es número primo");
        opc = leer.nextInt();
        switch (opc){
            case 1:
                if (num % 2 == 0){
                    System.out.println("El número " +num +" es par.");
                }
                else {
                    System.out.println("El número " +num +" es impar.");
                }
                break;
            case 2:
                if (num > 0){
                    System.out.println("El número " +num +" es positivo.");
                }
                else {
                    System.out.println("El número " +num +" es negativo.");
                }
                break;
            case 3:
                if (num % 5 == 0){
                    System.out.println("El número " +num +" es múltiplo de 5.");
                } 
                break;
            case 4:
                for (i = 1; i<= num; i++){
                    
                    if (num % i == 0){
                        primo = primo + 1;
                    }
                }
                if (primo == 2){
                        System.out.println("El número " +num +" es un número primo");
                    }
                else{
                    System.out.println("El número " +num +" NO es un número primo");
                }
                break;
            default:
                System.out.println("La opción escogida es erronea");
        }
    }
    
}
