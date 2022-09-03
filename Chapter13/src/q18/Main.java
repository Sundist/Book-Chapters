package q18;

import q15.Rational;


public class Main {
    public static void main(String[] args) {
        Rational resultRational = new Rational();
        long i = 2;
        while (i <= 100) {
            Rational rational = new Rational(i - 1, i);
            resultRational = resultRational.add(rational);
            i++;
        }
        System.out.println(resultRational.toString());
    }
}
