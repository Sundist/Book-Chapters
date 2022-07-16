import java.util.Arrays;
import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        System.out.print("Enter first list: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] liste1 = new int[size];
        for (int i = 0; i < size; i++) {
            liste1[i] = scanner.nextInt();
        }
        System.out.print("Enter second list: ");

        size = scanner.nextInt();
        int[] liste2 = new int[size];
        for (int i = 0; i < size; i++) {
            liste2[i] = scanner.nextInt();
        }

        if (equals(liste1, liste2))
            System.out.print("Lists are identical");
        else
            System.out.print("Lists are not identical");
    }

    public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;

        list1 = list1.clone();
        list2 = list2.clone();

        sort(list1);
        sort(list2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }


}
