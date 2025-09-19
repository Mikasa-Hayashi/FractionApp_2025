import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSub {

    /*  аспекты тестирования:
    - знак результата: положительный, отрицательный, равен нулю
    - свойства получившейся дроби: сократимая, несократимая, правильная, неправильная
    - знак знаменателя: положительный, отрицательный, равен нулю
    - знак числителя: положительный, отрицательный, равен нулю
    - диапазон знаменателя: [-
    */

    @Test
    void resultIsZeroIrreducibleAndReducible() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsZeroBothReducible() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsPositiveBothIrreducible() {
        Fraction expFraction = new Fraction(1, 6);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsPositiveIrreducibleAndReducible() {
        Fraction expFraction = new Fraction(1, 6);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 6);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsPositiveBothReducible() {
        Fraction expFraction = new Fraction(1, 6);
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(2, 6);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsNegativeBothIrreducible() {
        boolean expIsProper = false;
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expIsProper, actualFraction.isProper());
    }

    @Test
    void resultIsNegativeIrreducibleAndReducible() {
        boolean expIsProper = false;
        Fraction fraction1 = new Fraction(1, 3);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expIsProper, actualFraction.isProper());
    }

    @Test
    void resultIsNegativeBothReducible() {
        boolean expIsProper = false;
        Fraction fraction1 = new Fraction(2, 6);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expIsProper, actualFraction.isProper());
    }



    @Test
    void resultIsZeroBothIrreducible() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void numeratorAndDenominatorAreNegativeForBoth() {
        Fraction expFraction = new Fraction(1, 6);
        Fraction fraction1 = new Fraction(-1, -2);
        Fraction fraction2 = new Fraction(-1, -3);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void subtrahendValueIsZero() {
        Fraction expFraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(0, 1);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void reducedValueIsZero() {
        boolean expIsProper = false;
        Fraction fraction1 = new Fraction(0, 1);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expIsProper, actualFraction.isProper());
    }

    @Test
    void differentDenominatorsWithZeroNumerator() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(0, 2);
        Fraction fraction2 = new Fraction(0, 1);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsReducible() {
        Fraction expFraction = new Fraction(1, 2);
        Fraction fraction1 = new Fraction(12, 16);
        Fraction fraction2 = new Fraction(1, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void denominatorIsMaxValueForSecondFraction() {
        Fraction expFraction = new Fraction(1, Integer.MAX_VALUE/2);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, Integer.MAX_VALUE);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }
}