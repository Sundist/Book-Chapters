package q15;

public class Test {
    public static void main(String[] args) {
        Rational number1 = new Rational(6, 8);
        Rational number2 = new Rational(2, 3);
        System.out.println(number1.toString());
        System.out.println(number2.toString());
        System.out.println(number1.add(number2));
        System.out.println(number1.add(number2).floatValue());
        System.out.println(number1.multiply(number2));
        System.out.println(number1.divide(number2));
    }
}
