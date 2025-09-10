import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestToString {
    @Test
    void simpleTest() {
        String expString = "1/2";
        Fraction fraction = new Fraction(1, 2);
        String actualString = fraction.toString();        
        Assertions.assertEquals(expString, actualString);
    }
}