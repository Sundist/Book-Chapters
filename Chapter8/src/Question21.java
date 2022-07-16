import java.util.Arrays;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the city number: ");
        int numberOfCities = scanner.nextInt();
        System.out.print("Enter the coordinates of cities ");
        double[][] cities = new double[numberOfCities][2];
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < 2; j++) {
                cities[i][j] = scanner.nextDouble();
            }
        }
        int central = getCentralCity(cities);
        System.out.println("Total distance is to other cities:" + sum(cities, central));
    }

    public static int getCentralCity(double[][] c) {
        double[] dests = new double[c.length];
        double big = 0;
        int index = 0;
        for (int x = 0; x < c.length; x++) {
            double dest = 0;
            for (int y = 0; y < c[0].length; y++) {
                dest = Math.sqrt(Math.pow(c[x][y] - x, 2) + Math.pow(c[x][y] - y, 2));
            }
            dests[x] = dest;
            if (dests[x] < big) {
                big = dests[x];
                index = x;
            }
        }
        System.out.println("Cental city is at (" + c[index][0] + "," + c[index][1] + ")");
        return index;
    }

    public static double sum(double[][] c, int city) {
        double sum = 0;
        double x = c[city][0];
        double y = c[city][1];
        for (int i = 0; i < c.length; i++) {
            sum += Math.sqrt(Math.pow(c[i][0] - x, 2) + Math.pow(c[i][1] - y, 2));
        }
        return sum;
    }
}
