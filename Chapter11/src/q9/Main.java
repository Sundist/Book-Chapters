package q9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size n");
        int n = scanner.nextInt();
        Random random = new Random();
        ArrayList<Object> arrays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++)
                array.add(random.nextInt(2));
            arrays.add(array);
        }
        System.out.println(arrays);
    }
}
