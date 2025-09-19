package fractionapp;

/** Несократимая дробь.
 */
public class Fraction {
    
    /* =========================== Свойства =============================== */
    /** Метод, который возвращает флаг, является ли дробь правильной.
     *
     * @return true, если дробь правильная;
     * false, если дробь неправильная
     */
    public boolean isProper() {
        return isProper;
    }

    /* ---------------------- Числитель и знаменатель --------------------- */
    private final int _numerator;
    private final int _denominator;
    private boolean isProper = true;
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    
    /** Создание дроби с указанием ее числителя и знаменателя.
     *
     * @param numerator числитель (>= 0)
     * @param denominator знаменатель (> 0)
     */
    public Fraction(int numerator, int denominator) {
        if ((numerator < 0 || denominator <= 0) && !(numerator < 0 && denominator < 0)) {
            isProper = false;
        }
        if (Math.abs(numerator) >= Math.abs(denominator)) {
            isProper = false;
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        _numerator = Math.abs(numerator) / gcd;
        _denominator = Math.abs(denominator) / gcd;
    }

    /* --------------------- Вспомогательные методы ---------------------- */
    /** Вычисление наибольшего общего делителя для двух чисел
     * с использованием алгоритма Евклида.
     *
     * @param a первое число
     * @param b второе число
     * @return наибольший общий делитель
     */
    private int gcd(int a, int b) {
        return b==0 ? a : gcd(b, a%b);
    }
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение данной дроби с другой дробью.
     *
     * @param f вторая слагаемая дробь
     * @return новая дробь, являющаяся суммой дробей
     */
    public Fraction add(Fraction f) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new Fraction(
                _numerator * f._denominator + f._numerator * _denominator,
                _denominator * f._denominator
        );
    }

    /** Вычитание из данной дроби другой дроби.
     *
     * @param f вычитаемая дробь
     * @return новая дробь, являющаяся разностью дробей
     */
    public Fraction sub(Fraction f) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new Fraction(
                _numerator * f._denominator - f._numerator * _denominator,
                _denominator * f._denominator
        );
    }

    /** Умножение данной дроби на другую дробь.
     *
     * @param f вторая дробь-множитель
     * @return новая дробь, являющаяся произведением дробей
     */
    public Fraction mul(Fraction f) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new Fraction(
                _numerator * f._numerator,
                _denominator * f._denominator
        );
    }
    
    /** Деление данной дроби на другую дробь.
     *
     * @param f дробь-делитель
     * @return новая дробь, являющаяся частным дробей
     */
    public Fraction div(Fraction f) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new Fraction(
                _numerator * f._denominator,
                _denominator * f._numerator
        );
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение данной дроби с другой дробью.
     *
     * @param f сравниваемая дробь
     * @return -1, если данная дробь меньше;
     * 1, если данная дробь больше;
     * 0, если дроби равны
     */
    public int compareTo(Fraction f) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        int left = _numerator * f._denominator;
        int right = f._numerator * _denominator;
        return Integer.compare(left, right);
    }
    
    /** Проверка эквивалентности данной дроби с другой дробью.
     *
     * @param obj объект проверяемой дроби
     * @return false, если дроби не эквивалентны;
     * true, если дроби эквивалентны;
     */
    @Override
    public boolean equals(Object obj) {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return this.compareTo(other) == 0;
    }
    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представление данной дроби в виде строки.
     *
     * @return представление дроби в виде строки
     */
    @Override
    public String toString() {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        if (_numerator == 0) {
            return "0";
        }
        return _numerator + "/" + _denominator;
    }

    /** Представление данной дроби в виде вещественного числа.
     *
     * @return представление дроби в виде вещественного числа
     */
    public double toDouble() {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return (double) _numerator / _denominator;
    }
}
