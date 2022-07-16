import java.util.Arrays;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter strings to sort: ");
        String str = scanner.nextLine();

        System.out.print(sort(str));
    }


    public static String sort(String s) {
        String newString = "";
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            char maxChar = array[i];
            for (int j = 0; j < array.length; j++) {
                if (maxChar > array[j]) {
                    char temp = maxChar;
                    maxChar = array[j];
                    array[j] = temp;
                }
            }
            newString += maxChar;
        }

        return newString;
    }
}
