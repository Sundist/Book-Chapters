import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for n x n matrix size: ");
        int size = scanner.nextInt();
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix1[row][col] = scanner.nextInt();
                // System.out.print(matrix1[row][col] + " ");
            }
            //System.out.println();
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix2[row][col] = scanner.nextInt();
                //System.out.print(matrix2[row][col] + " ");
            }
            //System.out.println();
        }

        System.out.println(equals(matrix1, matrix2));
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int counter = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    if (m1[i][j] == m2[i][k])
                        counter++;
                }
            }
        }
        if (counter == m1.length * m1[0].length)
            return true;
        return false;
    }
}
