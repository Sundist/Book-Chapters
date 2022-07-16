import java.util.Scanner;

public class Question20 {
    public static int counter_red = 0;
    public static int counter_yellow = 0;

    public static void main(String[] args) {
        int ROW = 6;
        int COL = 7;
        char[][] BOARD;
        char RED = 'R';
        char YELLOW = 'Y';
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        while (counter_red != 4 || counter_yellow != 4) {
            round++;
            BOARD = new char[ROW][COL];
            if (round % 2 == 0) {
                System.out.print("Drop a red pack to a column 0 - 6: ");
                int input = scanner.nextInt();
                place(BOARD, input, RED);

            }
            System.out.print("Drop a yellow pack to a column 0 - 6: ");
            int input = scanner.nextInt();
            place(BOARD, input, YELLOW);

        }
    }

    public static void place(char[][] board, int col, int color) {
        // TODO
        int dropped = board[board.length - 1][col];
        for (int row = board.length - 1; row >= 0; row--) {

        }
        counter_yellow++;
    }


}
