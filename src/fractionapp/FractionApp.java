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
        ProperFraction fraction1 = new ProperFraction(3, 2);
        ProperFraction fraction2 = new ProperFraction(5, 3);
        ProperFraction fraction3 = fraction1.mul(fraction2);
        ProperFraction fraction4 = fraction1.add(fraction2);
        ProperFraction fraction5 = fraction1.sub(fraction2);
        ProperFraction fraction6 = fraction1.div(fraction2);
        ProperFraction fraction7 = new ProperFraction(9, 10);

        System.out.println(fraction3);
        System.out.println(fraction4);
        System.out.println(fraction5);
        System.out.println(fraction6);
        System.out.println(fraction1.compareTo(fraction3));
        System.out.println(fraction4.compareTo(fraction1));
        System.out.println(fraction1.equals(fraction3));
        System.out.println(fraction6.compareTo(fraction7));
        System.out.println(fraction6.equals(fraction7));

        System.out.println(fraction1.toDouble());
        System.out.println(fraction2.toDouble());
        System.out.println(fraction3.toDouble());
        System.out.println(fraction4.toDouble());
        System.out.println(fraction5.toDouble());
        System.out.println(fraction6.toDouble());
        System.out.println(fraction7.toDouble());
    }
    
}
