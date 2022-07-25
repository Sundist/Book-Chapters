package q16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 1; i < 50; i++)
            sb.append("0");
        BigInteger number = new BigInteger(sb.toString());
        int counter = 0;
        BigInteger r = new BigInteger("0");
        while (counter < 10) {
            number = number.add(new BigInteger("1"));
            if (r.compareTo(number.remainder(new BigInteger("2"))) == 0 ||
                    r.compareTo(number.remainder(new BigInteger("3"))) == 0) {
                counter++;
                System.out.println(number.toString());
            }
        }

    }
}
