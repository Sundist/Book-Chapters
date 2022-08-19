package q13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers to add array");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(scanner.nextInt());
        System.out.println(arr + "\nAfter duplicates removed");
        removeDuplicate(arr);

    }


    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer element : list) {
            if (!set.contains(element)) {
                arr.add(element);
                set.add(element);
            }
        }
        System.out.println(arr);
    }

}
