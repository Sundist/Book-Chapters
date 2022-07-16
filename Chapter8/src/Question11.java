import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        char[][] matrix = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 0-511 ");
        int input = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while (input > 0) {
            sb.insert(pos, input % 2);
            input /= 2;
            pos++;
        }
        sb.reverse();
        while (sb.length() != 9)
            sb.insert(0, 0);
        System.out.println(sb);

        for (int i = 0, z = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[1].length; j++, z++) {
                if (sb.charAt(z) == '0')
                    matrix[i][j] = 'H';
                else
                    matrix[i][j] = 'T';
            }
        }

        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix[1].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
