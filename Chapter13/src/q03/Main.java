package q03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsorted Arraylist");
        ArrayList<Number> arraylist = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arraylist.add(new Random().nextDouble(100.0));
            System.out.print(arraylist.get(i) + " ");
        }
        sort(arraylist);
    }

    public static void sort(ArrayList<Number> list) {
        System.out.println("\nSorted Arraylist");
        for (int i = 0; i < list.size() - 1; i++) {
            Number min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
