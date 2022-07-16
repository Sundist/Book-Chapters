import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rhe row and columns of matrix ");
        // int rows = scanner.nextInt();
        // int cols = scanner.nextInt();
        int SIZE = 4;
        Random random = new Random();
        // double[][] matrix = new double[rows][cols];
        double[][] matrix = new double[SIZE][SIZE];
        // System.out.println("Enter matrix ");
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                matrix[row][col] = random.nextInt(100);
                // matrix[row][col] = scanner.nextDouble();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Largest element at " + Arrays.toString(locateLargest(matrix)));
    }

    public static int[] locateLargest(double[][] a) {
        int[] returnedArr = new int[2];
        double max = 0;
        for (int row = 0; row < a[0].length; row++) {
            for (int col = 0; col < a[1].length; col++) {
                if (a[row][col] > max) {
                    max = a[row][col];
                    returnedArr[0] = row;
                    returnedArr[1] = col;
                }
            }
        }
        return returnedArr;
    }
}
