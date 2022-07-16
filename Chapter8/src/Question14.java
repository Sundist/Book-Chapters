import java.util.Random;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter size of square matrix: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                matrix[row][col] = random.nextInt(2);
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        checkColumns(matrix);
        checkRows(matrix);
        checkDiagonal(matrix);
    }

    public static void checkDiagonal(int[][] a) {
        int size = a.length;
        int counter = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col)
                    counter += a[row][col];
            }
        }
        if (counter == size)
            System.out.print("Major Diagonal is 1");
        else if (counter > 0)
            System.out.println("No same number in Major Diagonal");
        else
            System.out.println("Major Diagonal is 0");
        // TODO sun diagonal kontrol edilmemis
    }

    public static void checkColumns(int[][] a) {
        int size = a.length;
        int flag = 0;
        int[] columns = new int[size];
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                if (a[row][col] == 1)
                    columns[col]++;
            }
        }
        for (int i = 0; i < size; i++) {
            if (columns[i] == size) {
                flag++;
                System.out.println("All 1's at column " + i);
            } else if (columns[i] == 0) {
                flag++;
                System.out.println("All 0's at column " + i);
            }
        }
        if (flag == 0)
            System.out.println("No same number in columns");
    }

    public static void checkRows(int[][] a) {
        int size = a.length;

        int[] rows = new int[size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (a[row][col] == 1)
                    rows[row]++;
            }
        }

        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (rows[i] == size) {
                flag++;
                System.out.println("All 1's at row " + i);
            } else if (rows[i] == 0) {
                flag++;
                System.out.println("All 0's at row " + i);
            }
        }
        if (flag == 0)
            System.out.println("No same number in rows");
    }
}
