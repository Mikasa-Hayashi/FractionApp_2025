package fractionapp;

/** Несократимая дробь.
 */
public class Fraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int numerator;
    private int denominator;
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    
    /** Создание дроби с указанием ее числителя и знаменателя.
    * 
    */ 
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    /** Создание дроби на основе целого числа.
    * 
    */ 
    public Fraction(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * 
    */
    public Fraction add(Fraction f) {
        return new Fraction(
            this.numerator * f.denominator + f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Вычитание двух дробей.
    * 
    */
    public Fraction sub(Fraction f) {
        return new Fraction(
            this.numerator * f.denominator - f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Умножение двух дробей.
    * 
    */
    public Fraction mul(Fraction f) {
        return new Fraction(
            this.numerator * f.numerator,
            this.denominator * f.denominator
        );
    }
    
    /** Деление двух дробей.
    * 
    */
    public Fraction div(Fraction f) {
        return new Fraction(
            this.numerator * f.denominator,
            this.denominator * f.numerator
        );
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * 
    */ 
    public int compareTo(Fraction f) {
        int left = this.numerator * f.denominator;
        int right = f.numerator * this.denominator;
        if (left < right) return -1;
        if (left > right) return 1;
        return 0;
    }
    
    /** Эквивалентность двух дробей.
    * 
    */     
    public boolean equals(Fraction f) {
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
}
