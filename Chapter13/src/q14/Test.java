package q14;

public class Test {

    public static void main(String[] args) {
        Rational r1 = new Rational(5, 7);
        Rational r2 = new Rational(45, 4);
        System.out.println(r1.toString() + " " + r2.toString());
        System.out.println(r1.add(r2).floatValue());
        System.out.println(r1.divide(r2).floatValue());
    }
}
