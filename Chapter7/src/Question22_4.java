public class Question22_4 {

    private static int AVAILABLE = 0;
    private static int QUEEN = 1;
    private static int NOT_AVAILABLE = 2;


    public static void main(String[] args) {
        final int MAX_TRY = 10_000;
        final int SIZE = 8;
        int[][] board;
        while (true) {
            board = new int[SIZE][SIZE];
            int occupy = 0;
            int numberOfTyr = 0;
            boolean completed = true;
            while (occupy < SIZE) {
                int row = (int) (Math.random() * SIZE);
                int col = (int) (Math.random() * SIZE);
                numberOfTyr++;
                System.out.println(row + " " + col);
                if (checkAvailability(board, row, col)) {
                    numberOfTyr = 0;
                    occupy(board, row, col);
                    occupy++;
                }

                if (numberOfTyr > MAX_TRY) {
                    completed = false;
                    break;
                }
                // find empty cell
                // check available
                // if you could not found empty cell in 1000 times, break the for to try again
                // occupy();
            }
            // if ok, break
            if (completed) {
                break;
            }
        }
        printBoard(board);
    }

    public static boolean checkAvailability(int[][] board, int row, int col) {

        for (int i = 0; i < board.length; i++)
            if (board[i][col] == QUEEN) return false;

        for (int i = 0; i < board.length; i++)
            if (board[row][i] == QUEEN) return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == QUEEN) return false;

        for (int i = row, j = col; i < board.length && j < board.length; i++, j++)
            if (board[i][j] == QUEEN) return false;

        return true;
    }

    public static void occupy(int[][] board, int row, int col) {
        board[row][col] = QUEEN;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
