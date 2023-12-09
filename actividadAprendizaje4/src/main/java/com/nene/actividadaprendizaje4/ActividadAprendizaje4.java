
package com.nene.actividadaprendizaje4;

import java.util.Scanner;

public class ActividadAprendizaje4 {

    public static void main(String[] args) {
        
        Scanner sc = new  Scanner(System.in);
        int matris[][] = new int[10][10];
        
        System.out.println("Ingrese los datos con los que va llenar la matris");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matris[i][j] = sc.nextInt(); 
            }
        }
 
        System.out.println("La matris quedo llena de la siguiente manera");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}
