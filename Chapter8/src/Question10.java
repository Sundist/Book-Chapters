import java.util.Random;

public class Question10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Most Row: " + largestRow(matrix));
        System.out.println("Most Column: " + largestColumn(matrix));
    }

    public static int largestColumn(int[][] matrix) {
        int maxColumn = 0;
        int max = 0;
        for (int col = 0; col < 4; col++) {
            int counter = 0;
            for (int row = 0; row < 4; row++) {
                if (matrix[row][col] == 1)
                    counter++;
            }
            if (max < counter) {
                max = counter;
                maxColumn = col;
            }
        }
        return maxColumn;
    }

    public static int largestRow(int[][] matrix) {
        int maxRow = 0;
        int max = 0;
        for (int row = 0; row < 4; row++) {
            int counter = 0;
            for (int col = 0; col < 4; col++) {
                if (matrix[row][col] == 1)
                    counter++;
            }
            if (counter > max) {
                max = counter;
                maxRow = row;
            }
        }
        return maxRow;
    }
}

