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
public class B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Opgave B.5:
        Skriv et program, der udregner alle primtal under 1.000.000,
        og udskriver det største.
        */
        int highestPrime = 0;
        for (int potPrime=2;potPrime<=1000000;potPrime++){
            System.out.println("Checker " + potPrime);
            boolean isPrime = true;
            for (int divisor = 2; divisor <= potPrime / 2; divisor++) {
                if (potPrime % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                highestPrime = potPrime;
            }
        }
        System.out.println("Højeste primtal er " + highestPrime);
    }
    
}
