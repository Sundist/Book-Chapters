public class Question16 {
    public static void main(String[] args) {
        int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        for (int[] ints : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        sort(matrix);
    }

    public static void sort(int[][] m) {
        boolean sorted = false;
        int[] temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][0] > m[i + 1][0] || (m[i][0] == m[i + 1][0] && m[i][1] > m[i + 1][1])) {
                    temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int[] ints : m) {
            for (int col = 0; col < m[1].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }
}
