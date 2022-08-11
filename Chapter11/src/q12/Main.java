package q12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            arr.add(scanner.nextDouble());
        System.out.println(sum(arr));
    }

    public static double sum(ArrayList<Double> arr) {
        double total = 0;
        for (Double a : arr) {
            total += a;
        }
        return total;
    }
}
