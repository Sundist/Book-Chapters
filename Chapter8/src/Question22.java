import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        System.out.print("Enter 6-6 matrix: ");
        System.out.println();
        int[][] matrix = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
                //matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        display(matrix);
        System.out.println(isEvenNumberOfOnes(matrix));
    }

    public static void display(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isEvenNumberOfOnes(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            int counter = 0;
            for (int col = 0; col < m[0].length; col++) {
                if (m[row][col] == 1)
                    counter++;
            }
            if (counter % 2 != 0)
                return false;
        }
        for (int col = 0; col < m.length; col++) {
            int counter = 0;
            for (int row = 0; row < m[0].length; row++) {
                if (m[col][row] == 1)
                    counter++;
            }
            if (counter % 2 != 0)
                return false;
        }
        return true;
    }
}
