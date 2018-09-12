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
public class B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Opgave B.4:
        Skriv et program, der givet en måneds nummer udskriver
        antallet af dage i denne måned.
        */
        for (int month=1; month<=12;month++) {
            switch (month) {
                /*
                dette er desværre ikke en mulighed
                case 1,3,5,7,8,10,12:System.out.println("31 dage");
                break;
                */
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Der er 31 dage i den " + month + ". måned");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Der er 30 dage i den " + month + ". måned");
                    break;
                case 2:
                    System.out.println("Der er 28 eller 29 dage i den " + month + ". måned");
                    break;
            }
        }
    }
    
}
