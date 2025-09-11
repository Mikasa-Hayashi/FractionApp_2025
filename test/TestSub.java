import fractionapp.ProperFraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSub {
    @Test
    void resultIsZero() {
        ProperFraction expFraction = new ProperFraction(0, 1);
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(2, 4);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void subSameFraction() {
        ProperFraction expFraction = new ProperFraction(0, 1);
        ProperFraction fraction = new ProperFraction(1, 2);
        ProperFraction actualFraction = fraction.sub(fraction);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void sameDenominators() {
        ProperFraction expFraction = new ProperFraction(1, 4);
        ProperFraction fraction1 = new ProperFraction(3, 4);
        ProperFraction fraction2 = new ProperFraction(2, 4);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void differentDenominators() {
        ProperFraction expFraction = new ProperFraction(4, 15);
        ProperFraction fraction1 = new ProperFraction(3, 5);
        ProperFraction fraction2 = new ProperFraction(1, 3);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void numeratorAndDenominatorAreNegativeForBoth() {
        ProperFraction expFraction = new ProperFraction(1, 6);
        ProperFraction fraction1 = new ProperFraction(-1, -2);
        ProperFraction fraction2 = new ProperFraction(-1, -3);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void subtrahendValueIsZero() {
        ProperFraction expFraction = new ProperFraction(1, 2);
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(0, 1);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void differentDenominatorsWithZeroNumerator() {
        ProperFraction expFraction = new ProperFraction(0, 1);
        ProperFraction fraction1 = new ProperFraction(0, 2);
        ProperFraction fraction2 = new ProperFraction(0, 3);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }

    @Test
    void resultIsReducible() {
        ProperFraction expFraction = new ProperFraction(1, 2);
        ProperFraction fraction1 = new ProperFraction(12, 16);
        ProperFraction fraction2 = new ProperFraction(1, 4);
        ProperFraction actualFraction = fraction1.sub(fraction2);
        Assertions.assertEquals(expFraction, actualFraction);
    }
}