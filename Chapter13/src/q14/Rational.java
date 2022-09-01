package q14;

import java.util.Arrays;

public class Rational extends Number implements Comparable<Number> {

    private long[] r = new long[2];

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        long n = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        long d = Math.abs(denominator) / gcd;
        r[0] = n;
        r[1] = d;
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
        return (double) r[0] * 1.0 / r[1];
    }


    private long gcd(long numerator, long denominator) {
        long n = Math.abs(numerator);
        long d = Math.abs(denominator);
        int gcd = 1;
        for (int k = 1; k <= n && k <= d; k++) {
            if (n % k == 0 && d % k == 0)
                gcd = k;
        }
        return gcd;
    }

    public long getNumerator() {
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    public Rational add(Rational a) {
        return new Rational(r[0] * a.getDenominator() + r[1] * a.getNumerator(),
                (r[1] * a.getDenominator()));
    }

    public Rational subtract(Rational a) {
        return new Rational(r[0] * a.getDenominator() - r[1] * a.getNumerator(),
                r[1] * a.getDenominator());
    }

    public Rational multiply(Rational a) {
        return new Rational(r[0] * a.getNumerator(), r[1] * a.getDenominator());
    }

    public Rational divide(Rational a) {
        return new Rational(r[0] * a.getDenominator(), r[1] * a.getNumerator());
    }

    @Override
    public int compareTo(Number o) {
        if (this.doubleValue() > o.doubleValue())
            return 1;
        else if (this.doubleValue() < o.doubleValue())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "r=" + Arrays.toString(r) +
                '}';
    }
}
