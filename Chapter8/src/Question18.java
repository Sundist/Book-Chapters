import java.util.Random;

public class Question18 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        for (int[] ints : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        shuffle(matrix);
    }

    public static void shuffle(int[][] m) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            int rand = (int) random.nextFloat(0, 1) * 2;
            int[] temp = m[i];
            m[i] = m[rand];
            m[rand] = temp;
        }

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[0].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
}
