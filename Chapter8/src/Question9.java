import java.util.Scanner;

public class Question9 {
    // TODO
    public static void main(String[] args) {
        String[][] grid = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 1) {
                System.out.print("Enter position for player X, x 0-1-2 ");
                x = scanner.nextInt();
                System.out.print("Enter position for player X, y 0-1-2 ");
                y = scanner.nextInt();
                grid[x][y] = "X";
                check(grid);
            } else {
                System.out.print("Enter position for player 0, x 0-1-2 ");
                x = scanner.nextInt();
                System.out.print("Enter position for player 0, y 0-1-2 ");
                y = scanner.nextInt();
                grid[x][y] = "0";
                check(grid);
            }
            printGrid(grid);
        }
    }

    private static void printGrid(String[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean check(String[][] grid) {
        // TODO
        return false;
    }
}


