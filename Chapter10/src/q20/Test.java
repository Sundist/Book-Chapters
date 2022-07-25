package q20;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        for (BigDecimal i = new BigDecimal("100");
             i.compareTo(new BigDecimal("1000")) <= 0;
             i = i.add(new BigDecimal("100"))) {
            System.out.println(i + "    " + getE(i));
        }
    }

    public static BigDecimal getE(BigDecimal v) {
        BigDecimal one = new BigDecimal("1");
        BigDecimal e = new BigDecimal("0.0");
        for (BigDecimal i = one; i.compareTo(v) <= 0; i = i.add(one)) {
            BigDecimal denominator = i;
            for (BigDecimal k = i.subtract(one);
                 k.compareTo(one) >= 1;
                 k = k.subtract(one)) {
                denominator = denominator.multiply(k);
            }
            e = e.add(one.divide(denominator, 25, BigDecimal.ROUND_UP));
        }
        return e;
    }
}
