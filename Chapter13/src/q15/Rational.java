package q15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {

    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = BigInteger.valueOf(((denominator > 0) ? 1 : -1) * numerator).divide(gcd);
        this.denominator = BigInteger.valueOf(Math.abs(denominator)).divide(gcd);
    }

    private static BigInteger gcd(long numerator, long denominator) {
        BigInteger n = BigInteger.valueOf(numerator);
        BigInteger d = BigInteger.valueOf(denominator);
        return n.gcd(d);
    }

    public long getNumerator() {
        return numerator.longValue();
    }

    public long getDenominator() {
        return denominator.longValue();
    }

    public Rational add(Rational secondRational) {
        return new Rational(this.getNumerator() * secondRational.getDenominator() +
                this.getDenominator() * secondRational.getNumerator(),
                this.getDenominator() * secondRational.getDenominator());
    }

    public Rational subtract(Rational secondRational) {
        return new Rational(this.getNumerator() * secondRational.getDenominator()
                - this.getDenominator() * secondRational.getNumerator(),
                this.getDenominator() * secondRational.getDenominator());
    }

    public Rational multiply(Rational secondRational) {
        return new Rational(this.getNumerator() * secondRational.getNumerator(),
                this.getDenominator() * secondRational.getDenominator());
    }

    public Rational divide(Rational secondRational) {
        return new Rational(this.getNumerator() * secondRational.getDenominator(),
                this.getDenominator() * secondRational.numerator.longValue());
    }

    @Override
    public int compareTo(Rational o) {
        if (this.doubleValue() > o.doubleValue())
            return 1;
        else if (this.doubleValue() < o.doubleValue())
            return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational) (o))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.longValue() * 1.0 / denominator.longValue();
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

}
