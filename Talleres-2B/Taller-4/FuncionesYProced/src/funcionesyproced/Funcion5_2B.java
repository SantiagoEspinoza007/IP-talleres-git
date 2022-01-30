/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesyproced;
import java.util.Scanner;
/**
 *
 * @author Santiago Espinoza
 */
public class Funcion5_2B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, n, numP, potP;
        double suma, denP, factP;
        numP = -1;
        denP = 0;
        potP = 0;
        suma = 0;
        System.out.println("\t---Serie Numérica---");
        System.out.print("\nIngrese el límite de la serie: ");
        n = leer.nextInt();
        
        for (i=1; i<=n; i++){
            numP = Numerador(numP);
            denP = Denominador(denP);
            factP = Factorial(denP);
            potP = Potencia(potP);
            
            System.out.println(numP+"^" +potP +"/" +denP +"!");
            
            suma = suma + ((numP^potP)/factP);
        }
        System.out.println("La suma de la serie numérica es: " +suma);
    }
    public static int Numerador(int num) {
        num = num + 2;
        return num;
    }
    public static double Denominador(double den) {
        den = den + 2;
        return den;
    }
    public static double Factorial(double den) {
        int fact, j, i;
        fact = 1;
        for (j=1; j<=den; j++){
            fact = fact * j;
        }
        return fact;
    }
    public static int Potencia(int pot) {
        pot = pot + 3;
        return pot;
    }
}
