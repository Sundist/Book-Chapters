import java.util.Random;
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for n x n matrix size: ");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix1[row][col] = scanner.nextInt();
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix2[row][col] = scanner.nextInt();
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(isStriclyIdentical(matrix1, matrix2));
    }

    public static boolean isStriclyIdentical(int[][] m1, int[][] m2) {
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[0].length; col++) {
                if (m1[row][col] != m2[row][col])
                    return false;
            }
        }
        return true;
    }
}
