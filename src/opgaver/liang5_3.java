/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public class liang5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Celsius\tFarenheit");
        for (double celsius = 0; celsius<=100; celsius+=2) {
            double farenheit = celsius * 9 / 5 + 32;
            System.out.printf("%.0f\t%.1f\n",celsius,farenheit);
        }
    }
    
}
