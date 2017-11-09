

public class Rational {

    private int numerator;
    private int denominator;

    //constructor
    public Rational(int num, int den) {
        this.numerator = num;
        this.denominator = den;

    }

    //addition
    double plus(Rational b) {
        double aNumer = (double) this.numerator;
        double aDenom = (double) this.denominator;
        double bNumer = (double) b.numerator;
        double bDenom = (double) b.denominator;
        double sum = 0;

        if (gcd(b.numerator, b.denominator) == 1 && gcd(this.numerator, this.denominator) == 1) {
            sum = (aNumer / aDenom) + (bNumer / bDenom);
        } else if (gcd(b.numerator, b.denominator) != 1) {
            bNumer /= gcd(b.numerator, b.denominator);
            bDenom /= gcd(b.numerator, b.denominator);
            System.out.println(b.toString() + " reduced is " + (int) bNumer + "/" + (int) bDenom);
            sum = (aNumer / aDenom) + (bNumer / bDenom);
        } else if (gcd(this.numerator, this.denominator) != 1) {
            aNumer /= gcd(this.numerator, this.denominator);
            aDenom /= gcd(this.numerator, this.denominator);
            sum = (aNumer / aDenom) + (bNumer / bDenom);
        }
        return sum;

    }

    //subtraction
    double minus(Rational b) {
        double aNumer = (double) this.numerator;
        double aDenom = (double) this.denominator;
        double bNumer = (double) b.numerator;
        double bDenom = (double) b.denominator;
        double diff = 0;

        if (gcd(b.numerator, b.denominator) == 1 && gcd(this.numerator, this.denominator) == 1) {
            diff = (aNumer / aDenom) - (bNumer / bDenom);
        } else if (gcd(b.numerator, b.denominator) != 1) {
            bNumer /= gcd(b.numerator, b.denominator);
            bDenom /= gcd(b.numerator, b.denominator);
            System.out.println(b.toString() + " reduced is " + (int) bNumer + "/" + (int) bDenom);
            diff = (aNumer / aDenom) - (bNumer / bDenom);
        } else if (gcd(this.numerator, this.denominator) != 1) {
            aNumer /= gcd(this.numerator, this.denominator);
            aDenom /= gcd(this.numerator, this.denominator);
            diff = (aNumer / aDenom) - (bNumer / bDenom);
        }
        return diff;
    }

    //multiplication
    double times(Rational b) {
        double aNumer = (double) this.numerator;
        double aDenom = (double) this.denominator;
        double bNumer = (double) b.numerator;
        double bDenom = (double) b.denominator;
        double prod = 0;

        if (gcd(b.numerator, b.denominator) == 1 && gcd(this.numerator, this.denominator) == 1) {
            prod = (aNumer / aDenom) * (bNumer / bDenom);
        } else if (gcd(b.numerator, b.denominator) != 1) {
            bNumer /= gcd(b.numerator, b.denominator);
            bDenom /= gcd(b.numerator, b.denominator);
            System.out.println(b.toString() + " reduced is " + (int) bNumer + "/" + (int) bDenom);
            prod = (aNumer / aDenom) * (bNumer / bDenom);
        } else if (gcd(this.numerator, this.denominator) != 1) {
            aNumer /= gcd(this.numerator, this.denominator);
            aDenom /= gcd(this.numerator, this.denominator);
            prod = (aNumer / aDenom) * (bNumer / bDenom);
        }

        return prod;
    }

    //division
    double divides(Rational b) {
        double aNumer = (double) this.numerator;
        double aDenom = (double) this.denominator;
        double bNumer = (double) b.numerator;
        double bDenom = (double) b.denominator;
        double quot = 0;

        if (gcd(b.numerator, b.denominator) == 1 && gcd(this.numerator, this.denominator) == 1) {
            quot = (aNumer / aDenom) / (bNumer / bDenom);
        } else if (gcd(b.numerator, b.denominator) != 1) {
            bNumer /= gcd(b.numerator, b.denominator);
            bDenom /= gcd(b.numerator, b.denominator);
            System.out.println(b.toString() + " reduced is " + (int) bNumer + "/" + (int) bDenom);
            quot = (aNumer / aDenom) / (bNumer / bDenom);
        } else if (gcd(this.numerator, this.denominator) != 1) {
            aNumer /= gcd(this.numerator, this.denominator);
            aDenom /= gcd(this.numerator, this.denominator);
            quot = (aNumer / aDenom) / (bNumer / bDenom);
        }

        return quot;
    }

    //print values as string
    public String toString() {
        String v = this.numerator + "/" + this.denominator;
        return v;
    }

//    int reduce(int num, int den){
//        int retVal = num/gcd(num,den);
//    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        Rational a = new Rational(23, 39);
        Rational b = new Rational(16, 32);
        System.out.println("A: " + a.toString() + "\n" + "B: " + b.toString());
        System.out.println("A * B: " + a.times(b));
        System.out.println("A + B: " + a.plus(b));
        System.out.println("A - B: " + a.minus(b));
        System.out.println("A / B: " + a.divides(b));



    }
}

