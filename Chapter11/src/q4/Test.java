package q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Returns Max value in ArrayList if size > 0");
        System.out.println("Enter number while number is not 0");
        ArrayList<Integer> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (scanner.nextInt() != 0)
            list.add(scanner.nextInt());

        System.out.println(maxValue(list));
    }

    public static Integer maxValue(ArrayList<Integer> list) {
        if (list.size() == 0 || list.isEmpty())
            return null;
        Integer max = list.indexOf(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(i) > max)
                max = list.indexOf(i);
        }
        return max;
    }
}
