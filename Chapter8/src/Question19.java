import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Consecutive four");
        System.out.println();
        // int rows = scanner.nextInt();
        // int cols = scanner.nextInt();
        int SIZE = 8;
        int SIZE_2 = 8;
        Random random = new Random();
        // double[][] matrix = new double[rows][cols];
        int[][] matrix = new int[SIZE][SIZE_2];
        // System.out.println("Enter matrix ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = random.nextInt(5);
                // matrix[row][col] = scanner.nextDouble();
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.print(isConsecutiveFour(matrix));

    }

    public static boolean isConsecutiveFour(int[][] values) {

        for (int row = 0; row < values.length; row++) {
            int counter = 0;
            int current = values[row][0];
            for (int col = 0; col < values[0].length; col++) {
                if (current == values[row][col]) {
                    counter++;
                    if (counter == 4)
                        return true;
                } else {
                    counter = 1;
                    current = values[row][col];
                }
            }
        }
        for (int col = 0; col < values[0].length; col++) {
            int counter = 0;
            int current = values[0][col];
            for (int row = 0; row < values.length; row++) {
                if (current == values[row][col]) {
                    counter++;
                    if (counter == 4)
                        return true;
                } else {
                    counter = 1;
                    current = values[row][col];
                }
            }
        }

        int index = 0;
        while (index < 8) {
            for (int row = 0; row < values.length; row++) {
                int current = values[index][row];
                int counter = 0;
                for (int col = values.length - 1 - row; col >= 0; col--) {
                    if (current == values[row][values[0].length - col - 1]) {
                        counter++;
                        if (counter == 4)
                            return true;
                    } else {
                        counter = 1;
                        current = values[row][col];
                    }
                }

            }
            index++;
        }

        return false;
    }
}
