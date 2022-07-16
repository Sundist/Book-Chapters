import java.util.Random;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers to drop: ");
        int numOfBalls = scanner.nextInt();
        System.out.print("Enter numbers of slots in bean machine: ");
        int numOfSlots = scanner.nextInt();

        String[][] paths = new String[numOfBalls][numOfSlots];
        for (int i = 0; i < numOfBalls; i++) {
            for (int j = 0; j < numOfSlots; j++) {
                paths[i][j] = getRandomPath();
                System.out.print(paths[i][j]);
            }
            System.out.println();
        }
        pathCounting(paths);

    }

    public static String getRandomPath() {
        return (Math.random() > 0.5) ? "L" :  "R";
    }

    public static void pathCounting(String[][] m) {

        int numOfBalls = m.length;
        int numOfSlots = m[0].length;

        int[] counters = new int[numOfSlots];
        for (String[] line : m) {
            int counter = 0;
            for (String s : line) {
                if (s.equals("R"))
                    counter++;
            }
            counters[counter]++;
        }

        for (int i = 0; i < numOfBalls; i++) {
            for (int j = 0; j < numOfSlots; j++) {
                if (numOfBalls - i <= counters[j]) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
