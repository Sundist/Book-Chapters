package q19;

import java.math.BigInteger;

import static q18.Test.isPrime;

public class Test {
    public static void main(String[] args) {
        for (BigInteger p = new BigInteger("2");
             p.compareTo(new BigInteger("100")) <= 0;
             p = p.add(new BigInteger("1"))) {
            if (isPrime(p)) {
                System.out.println(mersennePrime(p));
            }
        }
    }

    public static BigInteger mersennePrime(BigInteger n) {
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0;
             i = i.add(new BigInteger("1"))) {
            x = x.multiply(two);
        }
        return x.subtract(new BigInteger("1"));
    }
}
