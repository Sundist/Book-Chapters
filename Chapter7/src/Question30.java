import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of values ");
        int[] array = new int[scanner.nextInt()];
        System.out.print("Enter values ");
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();

        System.out.println(isConsecutiveFour(array));
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int counter = 0;
            for (int j = i; j < i + 4; j++) {
                if (values[i] == values[j])
                    counter++;
            }
            if (counter == 4)
                return true;
        }
        return false;
    }

    public static boolean isConsecutiveFour2(int[] values) {
        int current = values[0];
        int counter = 1;
        for (int i = 1; i < values.length; i++) {
            if (current != values[i]) {
                current = values[i];
                counter = 1;
            } else {
                counter++;
            }
            if (counter == 4)
                return true;
        }
        return false;
    }
}
