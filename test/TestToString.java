import fractionapp.ProperFraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestToString {
    @Test
    void irreducibleFraction() {
        String expString = "1/2";
        ProperFraction fraction = new ProperFraction(1, 2);
        String actualString = fraction.toString();        
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void reducibleFraction() {
        String expString = "1/2";
        ProperFraction fraction = new ProperFraction(2, 4);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }

    @Test
    void numeratorIsZero() {
        String expString = "0";
        ProperFraction fraction = new ProperFraction(0, 2);
        String actualString = fraction.toString();
        Assertions.assertEquals(expString, actualString);
    }
}