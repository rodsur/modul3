/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.Scanner;

/**
 *
 * @author rodsur
 */
public class liang2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("antal minutter");
        double minutter = input.nextDouble();
        double dage = ((minutter/60)/24);
        if (dage < 365) {
            System.out.println("Det er " + dage + " dage");
        } else {
            int år = (int)dage/365;
            dage = dage%365;
            System.out.println("Det er " + år + " år og " + dage + " dage");
        }
    }
    
}
