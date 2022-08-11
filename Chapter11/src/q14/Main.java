package q14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 int for arr1: ");
        for (int i = 0; i < 5; i++)
            arr1.add(scanner.nextInt());
        System.out.println("Enter 5 int for arr2: ");
        for (int i = 0; i < 5; i++)
            arr2.add(scanner.nextInt());
        System.out.println(union(arr1, arr2));
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }
}
