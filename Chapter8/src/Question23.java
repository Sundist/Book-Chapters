import java.util.Arrays;
import java.util.Scanner;

public class Question23 {
    // TODO soru yanlis anlasilmis duzeltilecek
    public static void main(String[] args) {
        System.out.print("Enter 6-6 matrix: ");
        System.out.println();
        int[][] matrix = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
               /* matrix[i][j] = (int) (Math.random() * 2);
                if (matrix[i][j] == 1)
                    evenCounter++;
                if (j == matrix[0].length - 1 && evenCounter % 2 != 0)
                    matrix[i][j] = 1;*/
            }
        }
        printMatrix(matrix);
        System.out.print("Enter indexes i and j for flip");
        int i = (int) (Math.random() * 6);//scanner.nextInt();
        int j = (int) (Math.random() * 6); //scanner.nextInt();
        System.out.println(i + " " + j);
        printMatrix(matrix);
        int[][] comp = Arrays.copyOf(matrix,matrix.length);
        System.out.println(Arrays.toString(compare(matrix, flip(comp, i, j))));

    }


    public static int[][] flip(int[][] matrix, int row, int col) {
        if (matrix[row][col] == 1) matrix[row][col] = 0;
        else matrix[row][col] = 1;
        return matrix;
    }

    public static int[] compare(int[][] m1, int[][] m2) {
        int[] arr = new int[2];
        for (int row = 0, row2 = 0; row < m1.length; row++, row2++) {
            for (int col = 0, col2 = 0; col < m1[0].length; col++, col2++) {
                if (m1[row][col] != m2[row2][col2]) {
                    arr[0] = row;
                    arr[1] = col;
                }
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
