/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionapp;

/**
 *
 * @author Noname
 */
public class FractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(5, 3);
        Fraction fraction3 = fraction1.mul(fraction2);
        Fraction fraction4 = fraction1.add(fraction2);

        System.out.println(fraction3);
        System.out.println(fraction4);
    }
    
}
