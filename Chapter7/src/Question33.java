import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        String[] years = {
                "monkey",
                "rooster",
                "dog",
                "pig",
                "rat",
                "ox",
                "tiger",
                "rabbit",
                "dragon",
                "snake",
                "horse",
                "sheep"
        };
        System.out.print("This is the " + years[year % years.length] + " year");
    }
}
