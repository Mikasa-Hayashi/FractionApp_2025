package fractionapp;

/** Несократимая дробь.
 */
public class ProperFraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int numerator;
    private int denominator;
    private boolean isValid = true;
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    
    /** Создание дроби с указанием ее числителя и знаменателя.
    * 
    */ 
    public ProperFraction(int numerator, int denominator) {
        if ((numerator < 0 || denominator <= 0) && !(numerator < 0 && denominator < 0)) {
            isValid = false;
        }
        if (Math.abs(numerator) >= Math.abs(denominator)) {
            isValid = false;
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = Math.abs(numerator) / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    /* --------------------- Вспомогательные методы ---------------------- */
    private int gcd(int a, int b) {
        return b==0 ? a : gcd(b, a%b);
    }
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * 
    */
    public ProperFraction add(ProperFraction f) {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new ProperFraction(
            this.numerator * f.denominator + f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Вычитание двух дробей.
    * 
    */
    public ProperFraction sub(ProperFraction f) {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }

        return new ProperFraction(
            this.numerator * f.denominator - f.numerator * this.denominator,
            this.denominator * f.denominator
        );
    }

    /** Умножение двух дробей.
    * 
    */
    public ProperFraction mul(ProperFraction f) {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return new ProperFraction(
            this.numerator * f.numerator,
            this.denominator * f.denominator
        );
    }
    
    /** Деление двух дробей.
    * 
    */
    public ProperFraction div(ProperFraction f) {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
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
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
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
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return this.compareTo(f) == 0;
    }
    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представить как строку.
    * 
    */
    @Override
    public String toString() {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        if (this.numerator == 0) {
            return "0";
        }
        return this.numerator + "/" + this.denominator;
    }

    /** Представить как вещественное число.
    * 
    */     
    public double toDouble() {
        if (!this.isValid) {
            throw new IllegalArgumentException("Fraction is not valid");
        }
        return (double) this.numerator / this.denominator;
    }
}
