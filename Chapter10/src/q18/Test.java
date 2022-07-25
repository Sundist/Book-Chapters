package q18;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf((long) Long.MAX_VALUE);
        int counter = 0;
        while (counter < 5) {
            number = number.add(BigInteger.valueOf(1));
            if (isPrime(number)) {
                System.out.println(number);
                counter++;
            }
        }
    }

    public static boolean isPrime(BigInteger n) {
        for (BigInteger d = new BigInteger("2");
             d.compareTo(n.divide(new BigInteger("2"))) <= 0;
             d = d.add(new BigInteger("1"))) {
            if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }
}
