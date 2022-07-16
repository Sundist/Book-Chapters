import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        System.out.print("ax2 + bx + c = 0 için a, b ve c giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double[] eqn = {a, b, c};
        double[] roots = new double[2];
        double determinant = solveQuadratic(eqn, roots);

        if (determinant > 0) {
            System.out.print("Roots are : " + roots[0] + " and " + roots[1]);
        } else if (determinant == 0) {
            System.out.print("Root is : " + roots[0]);
        } else {
            System.out.print("There is no root");
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double determinant = Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            roots[0] = (-eqn[1] + sqrt) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - sqrt) / (2 * eqn[0]);
        } else if (determinant == 0) {
            roots[0] = (-eqn[1] + sqrt) / (2 * eqn[0]);
        }

        return (int) determinant;
    }
}
