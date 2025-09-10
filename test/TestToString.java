import fractionapp.ProperFraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestToString {
    @Test
    void simpleTest() {
        String expString = "1/2";
        ProperFraction fraction = new ProperFraction(1, 2);
        String actualString = fraction.toString();        
        Assertions.assertEquals(expString, actualString);
    }
}