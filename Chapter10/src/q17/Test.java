package q17;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Math.sqrt(Long.MAX_VALUE));
        BigInteger number = BigInteger.valueOf((long) Math.sqrt(Long.MAX_VALUE));
        System.out.println(number);
        int counter = 0;
        while (counter < 10) {
            number = number.add(BigInteger.valueOf(1));
            System.out.println(number + ", karesi, " + number.multiply(number));
            counter++;
        }
    }
}
