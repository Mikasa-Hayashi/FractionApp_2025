import fractionapp.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCompareTo {

    /*  аспекты тестирования:
    - свойство дроби: сократимая, несократимая
    - равенство дробей: дроби равны, левая дробь больше, левая дробь меньше
    - знак числителя: положительный, равен нулю
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
    void sameReducibleFractions() {
        int expRes = 0;
        Fraction fraction1 = new Fraction(3, 6);
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
    void firstFractionMoreThanSecondReducibleOne() {
        int expRes = 1;
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(4, 8);
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

    @Test
    void firstReducibleFractionLessThanSecondOne() {
        int expRes = -1;
        Fraction fraction1 = new Fraction(2, 4);
        Fraction fraction2 = new Fraction(3, 4);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void numeratorIsZeroForBothDifferentDenominator() {
        int expRes = 0;
        Fraction fraction1 = new Fraction(0, 1);
        Fraction fraction2 = new Fraction(0, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void firstFractionIsZero() {
        int expRes = -1;
        Fraction fraction1 = new Fraction(0, 2);
        Fraction fraction2 = new Fraction(1, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }

    @Test
    void secondFractionIsZero() {
        int expRes = 1;
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(0, 2);
        int actualRes = fraction1.compareTo(fraction2);
        Assertions.assertEquals(expRes, actualRes);
    }
}