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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración e Inicialización de las Variables
        int intentos, contraseña;
        boolean aciertos = false;
        contraseña = 0; intentos = 4;
        
        //Proceso
        do{
            System.out.println("Ingrese la contraseña: ");
            contraseña = leer.nextInt();
            if(contraseña == 9876){
                aciertos = true;
            }
            else{
                System.out.println("Lo siento, esa no es la combinación");
            }
            intentos --;
        }while(intentos>0 && !aciertos);
        
        if (aciertos){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }
        else{
            System.out.println("La caja fuerte ha sido bloqueada");
        }
    }
}
