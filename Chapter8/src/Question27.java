import java.util.Random;
import java.util.Scanner;

public class Question27 {
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
        for (int col = 0; col < m.length; col++) {
            for (int row = 0; row < m[0].length - 1; row++) {
                double min = m[row][col];
                int index = row;
                for (int i = row + 1; i < m[0].length; i++) {
                    if (min > m[i][col]) {
                        min = m[i][col];
                        index = i;
                    }
                }
                if (index != row) {
                    m[index][col] = m[row][col];
                    m[row][col] = min;
                }
            }
        }
        return m;
    }

}
