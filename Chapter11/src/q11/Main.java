package q11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++)
            arr.add(scanner.nextInt());
        sort(arr);
    }

    public static void sort(ArrayList<Integer> list) {

    }
}
