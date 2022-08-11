package q13;

import java.util.ArrayList;
import java.util.Scanner;

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
        for (Integer element : list) {
            if (!arr.contains(element))
                arr.add(element);
        }
        System.out.println(arr);
    }

}
