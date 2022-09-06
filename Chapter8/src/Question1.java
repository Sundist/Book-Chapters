import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        double[][] matrix = createRandomArray();

        displayMatrix(matrix);

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + String.format("%.2f", sumColumn(matrix, col)));
        }
    }

    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static double[][] createRandomArray() {
        Random random = new Random();
        double[][] matrix = new double[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextDouble(100);
            }
        }
        return matrix;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
