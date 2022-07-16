public class Question4 {
    public static void main(String[] args) {
        int[] empSum = new int[8];
        int[][] schedule =
                {
                        {2, 4, 3, 4, 5, 8, 8},
                        {7, 3, 4, 3, 3, 4, 4},
                        {3, 3, 4, 3, 3, 2, 2},
                        {9, 3, 4, 7, 3, 4, 1},
                        {3, 5, 4, 3, 6, 3, 8},
                        {3, 4, 4, 6, 3, 4, 4},
                        {3, 7, 4, 8, 3, 8, 4},
                        {6, 3, 5, 9, 2, 7, 9}
                };
        for (int emp = 0; emp < schedule.length; emp++) {
            int sum = 0;
            for (int day = 0; day < schedule[0].length; day++) {
                sum += schedule[emp][day];
            }
            empSum[emp] = sum;
            System.out.println("Emp " + emp + " total hours " + sum);
        }
        System.out.println();


        for (int i = 0; i < empSum.length; i++) {
            for (int j = 0; j < empSum.length; j++) {
                if (empSum[j] < empSum[i]) {
                    int temp = empSum[i];
                    empSum[i] = empSum[j];
                    empSum[j] = temp;
                }
            }
        }
        for (int i = 0; i < empSum.length; i++)
            System.out.println("Emp " + i + " total hours " + empSum[i]);
    }
}
