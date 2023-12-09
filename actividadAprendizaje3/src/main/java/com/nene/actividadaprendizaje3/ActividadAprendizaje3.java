
package com.nene.actividadaprendizaje3;

import java.util.Scanner;
public class ActividadAprendizaje3 {

    public static void main(String[] args) {
       
        System.out.println("EL numero es: "+numeroRandom());    
    }
    public static int numeroRandom(){
        int numero = (int)(Math.random()*51);
        return numero;
    }

}
