import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = 10;

        System.out.print("Enter " + N + " numbers: ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.println(" (" + array[i] + ", " + array[j] + ") ");
            }
        }
    }
}
