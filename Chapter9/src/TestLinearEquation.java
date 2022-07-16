import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficients: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        LinearEquation result = new LinearEquation(a, b, c, d, e, f);
        if (result.isSolvable()) {
            System.out.println("x is " + result.getX() + " and y is " + result.getY());
        } else
            System.out.println("The equation has no solution.");

    }
}
