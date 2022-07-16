import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        System.out.print("Enter a 4-by-4 matrix");
        Random random = new Random();
        double[][] matrix = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //matrix[i][j] = scanner.nextDouble();
                matrix[i][j] = random.nextDouble(100);
            }
        }
        System.out.println();
        System.out.print(String.format("%.2f", sumMajorDiagonal(matrix)));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
