import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSub {
    @Test
    void resultIsZero() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void subSameFraction() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction = new Fraction(1, 2);
        Fraction actualFraction = fraction.sub(fraction);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void sameDenominators() {
        Fraction expFraction = new Fraction(1, 4);
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 4);
        Fraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void differentDenominators() {
        Fraction expFraction = new Fraction(4, 15);
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(1, 3);
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
    void differentDenominatorsWithZeroNumerator() {
        Fraction expFraction = new Fraction(0, 1);
        Fraction fraction1 = new Fraction(0, 2);
        Fraction fraction2 = new Fraction(0, 3);
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
}