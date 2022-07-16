public class Question17 {
    public static void main(String[] args) {

        double[][] lend = {
                {0, 100.5, 0, 0, 320.5},
                {0, 0, 40, 85, 0},
                {125, 0, 0, 75, 0},
                {125, 0, 0, 0, 0},
                {0, 0, 125, 0, 0},
        };

        double[] currentBalance = {25.0, 125.0, 175.0, 75.0, 181.0};
        double[] borrow = new double[5];
        for (int row = 0; row < lend.length; row++) {
            double sum = 0.0;
            for (int col = 0; col < lend[0].length; col++) {
                sum += lend[row][col];
            }
            for (int z = 0; z < lend[0].length; z++) {
                borrow[row] += lend[z][row];
            }

            //System.out.print(borrow[row] + " " + sum + " " + (sum - currentBalance[row] + " " + currentBalance[row]));
            //System.out.println();
            double v = borrow[row] + currentBalance[row];
            double v1 = v - sum;
            if (v1 < 200) {
                System.out.println(row + " is at danger " + v1 + " " + v);
            }
        }
    }
}
