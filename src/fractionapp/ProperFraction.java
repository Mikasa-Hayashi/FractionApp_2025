package fractionapp;

/** Несократимая дробь.
 */
public class ProperFraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int numerator;
    private int denominator;
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    
    /** Создание дроби с указанием ее числителя и знаменателя.
    * 
    */ 
    public ProperFraction(int numerator, int denominator) {
        if (numerator < 0) {
            throw new IllegalArgumentException("Numerator must be >= 0");
        }
        if (denominator <= 0) {
            throw new IllegalArgumentException("Denominator must be > 0");
        }
        if (numerator >= denominator) {
            throw new IllegalArgumentException(String.format(
                "Fraction \"%s/%s\" is improper: (numerator >= denominator)", 
                numerator, 
                denominator
            ));
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }


    /** Создание дроби на основе целого числа.
    * 
    */ 
    public ProperFraction(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * 
    */
    public ProperFraction add(ProperFraction f) {
        return new ProperFraction(
            this.numerator * f.denominator + f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Вычитание двух дробей.
    * 
    */
    public ProperFraction sub(ProperFraction f) {
        return new ProperFraction(
            this.numerator * f.denominator - f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Умножение двух дробей.
    * 
    */
    public ProperFraction mul(ProperFraction f) {
        return new ProperFraction(
            this.numerator * f.numerator,
            this.denominator * f.denominator
        );
    }
    
    /** Деление двух дробей.
    * 
    */
    public ProperFraction div(ProperFraction f) {
        return new ProperFraction(
            this.numerator * f.denominator,
            this.denominator * f.numerator
        );
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * 
    */ 
    public int compareTo(ProperFraction f) {
        int left = this.numerator * f.denominator;
        int right = f.numerator * this.denominator;
        if (left < right) return -1;
        if (left > right) return 1;
        return 0;
    }
    
    /** Эквивалентность двух дробей.
    * 
    */     
    public boolean equals(ProperFraction f) {
        return this.compareTo(f) == 0;
    }
    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представить как строку.
    * 
    */
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    /** Представить как вещественное число.
    * 
    */     
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }
}
