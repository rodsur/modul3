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
public class liang5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        double fFromCelsius;
        double cFromFahrenheit;
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        for (celsius = 0, fahrenheit =20; 
            celsius <=100 && fahrenheit <=270;
            celsius+=2, fahrenheit +=5){
            fFromCelsius = celsius * 9 / 5 + 32;
            cFromFahrenheit = (fahrenheit  - 32) * 5 / 9;
            System.out.printf("%.0f\t%.3f\t\t\t%.0f\t\t%.3f\n",
                        celsius,fFromCelsius,
                        fahrenheit,cFromFahrenheit);
        }
    }
    
}
