import fractionapp.ProperFraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCompareTo {
    @Test
    void sameFractions() {
        int expRes = 0;
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(1, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void sameFractionsButWithReducibleOne() {
        int expRes = 0;
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(2, 4);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void firstFractionMoreThanSecondOne() {
        int expRes = 1;
        ProperFraction fraction1 = new ProperFraction(3, 4);
        ProperFraction fraction2 = new ProperFraction(1, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void firstFractionLessThanSecondOne() {
        int expRes = -1;
        ProperFraction fraction1 = new ProperFraction(1, 2);
        ProperFraction fraction2 = new ProperFraction(3, 4);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void test() {
        ProperFraction f = new ProperFraction(3, 4);

        ProperFraction exp = new ProperFraction(0, 1);

        ProperFraction result = f.sub(f);

        Assertions.assertEquals(exp, result);
    }
}