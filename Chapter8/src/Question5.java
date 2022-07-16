import java.util.Random;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        Random random = new Random();
        System.out.print("Enter first matrix's values");
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                //matrix1[row][col] = scanner.nextDouble();
                matrix1[row][col] = random.nextDouble(1, 10);
            }
        }
        System.out.print("Enter second matrix's values");
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                //matrix2[row][col] = scanner.nextDouble();
                matrix2[row][col] = random.nextDouble(1, 10);
            }
        }
        System.out.println("Matrix 1");
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                System.out.printf("%.2f ", matrix1[row][col]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2");
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                System.out.printf("%.2f ", matrix2[row][col]);
            }
            System.out.println();
        }

        System.out.println("Toplam Matrixi");
        double[][] addedMatrix = addMatrix(matrix1, matrix2);

        for (int row = 0; row < addedMatrix.length; row++) {
            for (int col = 0; col < addedMatrix[0].length; col++) {
                System.out.printf("%.2f ", addedMatrix[row][col]);
            }
            System.out.println();
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrix = new double[3][3];

        for (int row = 0; row < a.length; row++) {
            double sum = 0;
            for (int col = 0; col < a[0].length; col++) {
                sum = a[row][col] + b[row][col];
                matrix[row][col] = sum;
            }
        }
        return matrix;
    }
}
