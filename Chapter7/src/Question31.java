import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;


public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first list: ");
        int size = scanner.nextInt();

        int[] liste1 = new int[size];
        for (int i = 0; i < size; i++)
            liste1[i] = scanner.nextInt();

        System.out.print("Enter second list: ");
        int size2 = scanner.nextInt();

        int[] liste2 = new int[size2];
        for (int i = 0; i < size2; i++)
            liste2[i] = scanner.nextInt();

        Arrays.sort(liste1);
        Arrays.sort(liste2);

        print(merge(liste1, liste2));

    }
    // 5  1  5  16  61  111
    // 4  2  4  5  6

    public static int[] merge(int[] list1, int[] list2) {

        int[] newArray = new int[list1.length + list2.length];
        int k = 0;
        int i = 0;
        int j = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j])
                newArray[k++] = list1[i++];
             else
                newArray[k++] = list2[j++];
        }

        while (i < list1.length) {
            newArray[k++] = list1[i++];
        }

        while (j < list2.length) {
            newArray[k++] = list1[j++];
        }

        return newArray;
    }

    public static void print(int[] liste) {
        for (int i = 0; i < liste.length; i++) {
            System.out.print(liste[i] + " ");
        }
    }
}

