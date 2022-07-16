import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for n x n matrix size: ");
        int size = scanner.nextInt();
        double[][] matrix = new double[size][size];
        Random rand = new Random();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextDouble();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        double[][] sorted = sortRows(matrix);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(sorted[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[0].length - 1; col++) {
                double min = m[row][col];
                int index = col;
                for (int i = col + 1; i < m[0].length; i++) {
                    if (min > m[row][i]) {
                        min = m[row][i];
                        index = i;
                    }
                }
                if (index != col) {
                    m[row][index] = m[row][col];
                    m[row][col] = min;
                }
            }
        }
        return m;
    }

}
