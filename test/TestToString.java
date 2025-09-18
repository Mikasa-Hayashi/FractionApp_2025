import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestToString {
    @Test
    void irreducibleFraction() {
        String expString = "1/2";
        Fraction fraction = new Fraction(1, 2);
        String actualString = fraction.toString();        
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void reducibleFraction() {
        String expString = "1/2";
        Fraction fraction = new Fraction(2, 4);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void numeratorIsZero() {
        String expString = "0";
        Fraction fraction = new Fraction(0, 2);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void numeratorAndDenominatorAreNegative() {
        String expString = "1/2";
        Fraction fraction = new Fraction(-1, -2);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void denominatorMaxValue() {
        String expString = String.format("1/%d", Integer.MAX_VALUE);
        Fraction fraction = new Fraction(1, Integer.MAX_VALUE);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }
}