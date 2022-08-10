package q12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            arr.add(scanner.nextInt());
        System.out.println(sum(arr));
    }

    public static double sum(ArrayList<Integer> arr) {
        double total = 0;
        for (Integer a : arr) {
            total += a;
        }
        return total;
    }
}
