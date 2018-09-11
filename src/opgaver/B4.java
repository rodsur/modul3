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
        for (int month=1; month<=12;month++) {
                if (month%2 == 1) {
                    System.out.println("Måneden " + month + " er ulig og der er 30 dage");
                } else if (month%2 == 0 && month == 2) {
                    System.out.println("Det er Februar og der er 28 eller 29 dage");
                } else if (month%2 == 0) {
                    System.out.println("Måneden " + month + " er lige og der er 31 dage");
                }
        }
    }
    
}
