package fractionapp;

/** Несократимая дробь.
 */
public class Fraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int numerator;
    private int denominator;
    private boolean isProper = true;
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    
    /** Создание дроби с указанием ее числителя и знаменателя.
    * 
    */ 
    public Fraction(int numerator, int denominator) {
        if ((numerator < 0 || denominator <= 0) && !(numerator < 0 && denominator < 0)) {
            isProper = false;
        }
        if (Math.abs(numerator) >= Math.abs(denominator)) {
            isProper = false;
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = Math.abs(numerator) / gcd;
        this.denominator = Math.abs(denominator) / gcd;
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
            this.numerator * f.denominator + f.numerator * this.denominator,
            this.denominator * f.denominator
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
            this.numerator * f.denominator - f.numerator * this.denominator,
            this.denominator * f.denominator
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
            this.numerator * f.numerator,
            this.denominator * f.denominator
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
            this.numerator * f.denominator,
            this.denominator * f.numerator
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
        int left = this.numerator * f.denominator;
        int right = f.numerator * this.denominator;
        return Integer.compare(left, right);
    }
    
    /** Проверка эквивалентности данной дроби с другой дробью.
     *
     * @param obj объект проверяемой дроби
     * @return 0, если дроби не эквивалентны;
     * 1, если дроби эквивалентны;
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
        if (this.numerator == 0) {
            return "0";
        }
        return this.numerator + "/" + this.denominator;
    }

    /** Представление данной дроби в виде вещественного числа.
     *
     * @return представление дроби в виде вещественного числа
     */
    public double toDouble() {
        if (!this.isProper) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return (double) this.numerator / this.denominator;
    }
}
