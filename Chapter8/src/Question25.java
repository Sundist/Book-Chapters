import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for n x n matrix size: ");
        int size = scanner.nextInt();
        double[][] markov = new double[size][size];
        Random rand = new Random();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                //markov[row][col] = rand.nextFloat();
                markov[row][col] = scanner.nextDouble();
                System.out.print(markov[row][col] + " ");
            }
            System.out.println();
        }
        if (isMarkovMatrix(markov))
            System.out.println("Is a markov matrix");
        System.out.println("Is NOT a markov matrix");
    }
/*
            INPUT
        0,15  0,875  0,375
        0,55  0,005  0,225
        0,30  0,12  0,4
 */
    public static boolean isMarkovMatrix(double[][] m) {
        int counter = 0;
        for (int col = 0; col < m.length; col++) {
            double sum = 0;
            for (int row = 0; row < m[0].length; row++)
                sum += m[row][col];
            if (sum == 1)
                counter++;
        }
        if (counter == m[0].length)
            return true;
        return false;
    }

}

