import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ROW = 3;
        final int COL = 3;
        double[][] matrix1 = new double[ROW][COL];
        double[][] matrix2 = new double[ROW][COL];
        System.out.print("Enter first matrix: ");
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                matrix1[row][col] = scanner.nextDouble();
            }
        }
        System.out.print("Enter second matrix: ");
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                matrix2[row][col] = scanner.nextDouble();
            }
        }

        double[][] mulMatrix = multiplyMatrix(matrix1, matrix2);
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                System.out.printf("%.1f ", mulMatrix[row][col]);
            }
            System.out.println();
        }

    }


    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] newMatrix = new double[a.length][a.length];
        int row;
        int col;
        for (row = 0; row < a.length; row++) {
            for (col = 0; col < a.length; col++) {
                double sum = 0;
                for (int k = 0; k < a.length; k++) {
                    sum += a[row][k] * b[k][col];
                }
                newMatrix[row][col] = sum;
            }
        }
        return newMatrix;
    }
}
