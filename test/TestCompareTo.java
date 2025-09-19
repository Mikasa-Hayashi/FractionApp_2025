import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCompareTo {

    /*  аспекты тестирования:
    - тип дроби: сокращаемая, несокращаемая
    - равенство дробей: дроби равны, левая дробь больше, левая дробь меньше
    */

    @Test
    void sameFractions() {
        int expRes = 0;
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void sameFractionsButWithReducibleOne() {
        int expRes = 0;
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(2, 4);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void firstFractionMoreThanSecondOne() {
        int expRes = 1;
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void firstFractionLessThanSecondOne() {
        int expRes = -1;
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }
}