package q17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int m = in.nextInt();
        int n = findN(findSmallestFactors(m));
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + m * n);

    }

    public static ArrayList<Integer> findSmallestFactors(int m) {
        ArrayList<Integer> smallFactors = new ArrayList<>();
        int f = 2;
        while (m != 1) {
            if (m % f == 0) {
                smallFactors.add(f);
                m /= f;
            } else {
                f++;
            }
        }
        return smallFactors;
    }

    public static Integer findN(ArrayList<Integer> factors) {
        ArrayList<Integer> oddCounts = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int num = factors.get(i);
            int count = 0;
            for (Integer integer : factors) {
                if (integer == num) {
                    count++;
                }
            }
            if (count % 2 != 0 && !oddCounts.contains(num)) {
                oddCounts.add(num);
            }
        }
        Integer result = 1;
        for (Integer oddCount : oddCounts) {
            result *= oddCount;
        }
        return result;
    }
}
