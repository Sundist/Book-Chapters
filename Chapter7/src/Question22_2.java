import java.util.Random;

public class Question22_2 {
    public static void main(String[] args) {
        System.out.println("8-queen");

        int[] board =
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //   displayBoard(board);
        int[] dd = placement(board);
        displayBoard(dd);
    }

    public static int[] placement(int[] board) {
        Random random = new Random();
        int q1 = random.nextInt(8);
        int q2 = random.nextInt(16);
        int q3 = random.nextInt(24);
        int q4 = random.nextInt(32);
        int q5 = random.nextInt(40);
        int q6 = random.nextInt(48);
        int q7 = random.nextInt(56);
        int q8 = random.nextInt(64);
        while (q1 == q2 && q2 == q3 && q3 == q4 && q4 == q5 && q5 == q6 && q6 == q7 && q7 == q8) {
            q1 = random.nextInt(8);
            q2 = random.nextInt(16);
            q3 = random.nextInt(24);
            q4 = random.nextInt(32);
            q5 = random.nextInt(40);
            q6 = random.nextInt(48);
            q7 = random.nextInt(56);
            q8 = random.nextInt(64);
        }

        return board;
    }


    public static void displayBoard(int[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 8 == 0)
                System.out.println();
        }
    }
}
