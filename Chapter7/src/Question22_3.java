import java.util.Random;

public class Question22_3 {
    public static void main(String[] args) {
        int[] board = new int[64];
        Random random = new Random();
    }

    public static void display(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if (i % 8 == 0)
                System.out.println();
        }
    }
}
