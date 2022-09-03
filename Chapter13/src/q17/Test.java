package q17;

public class Test {
    public static void main(String[] args) {

        Complex c1 = new Complex(3.5, 5.5);
        Complex c2 = new Complex(-3.5, 1);

        System.out.println("Complex number 1: " + c1.toString() + ", Complex number 2: " + c2.toString());
        System.out.println("After Add: " + c1.add(c2));
        System.out.println("After Subtract: " + c1.subtract(c2));
        System.out.println("After Multiply: " + c1.multiply(c2));
        System.out.println("After Divide: " + c1.divide(c2));
        System.out.println("After Add Abs: " + c1.add(c2).abs());
        System.out.println("Abs: " + c1.abs());
    }
}
