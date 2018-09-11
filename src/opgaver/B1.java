/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.lang.Math;

/**
 *
 * @author rodsur
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Opgave B.1:
        Skriv et program, der udregner og udskriver arealet (π*r^2) af
        5 forskellige cirkler med radius 1, 2, 3, 4 og 5.
        */
        
        double area;
        for (int i=1; i<=5; i++) {
            area = i * i * Math.PI;
            System.out.println("Arealet for en cirkel med radius " + i + " er: " + area);
        }
    }
}
