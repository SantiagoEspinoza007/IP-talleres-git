/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author SALAA
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] mat = {
            {4, 7, 10 ,-1},
            {9, 12, 24, 30},
            {10, 8, 6, 1}
        };
        
        for (int i=0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j] +"\t");
            }
            System.out.println("");
        }
        
    }
    
}
