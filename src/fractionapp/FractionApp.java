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
        Fraction fraction5 = fraction1.sub(fraction2);
        Fraction fraction6 = fraction1.div(fraction2);
        Fraction fraction7 = new Fraction(9, 10);

        System.out.println(fraction3);
        System.out.println(fraction4);
        System.out.println(fraction5);
        System.out.println(fraction6);
        System.out.println(fraction1.compareTo(fraction3));
        System.out.println(fraction4.compareTo(fraction1));
        System.out.println(fraction1.equals(fraction3));
        System.out.println(fraction6.compareTo(fraction7));
        System.out.println(fraction6.equals(fraction7));
    }
    
}
