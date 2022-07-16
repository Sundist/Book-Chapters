import java.util.Scanner;

public class Question26 {

    public static void main(String[] args) {
        System.out.print("Enter first list: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] liste1 = new int[size];
        int[] liste2 = new int[size];
        for (int i = 0; i < size; i++) {
            liste1[i] = scanner.nextInt();
        }
        System.out.print("Enter second list: ");
        int size2 = scanner.nextInt();
        for (int i = 0; i < size2; i++) {
            liste2[i] = scanner.nextInt();
        }

        if (equals(liste1, liste2))
            System.out.print("Lists are strictly identical");
        else
            System.out.print("Lists are not strictly identical");
    }

    public static boolean equals(int list1[], int list2[]) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
