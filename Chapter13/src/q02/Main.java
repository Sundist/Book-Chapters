package q02;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> array = new ArrayList<>();
        System.out.println("Arraylist is sorted");
        for (int i = 0; i < 9; i++)
            array.add(i * 5 + 4);
        printArray(array);
        shuffle(array);
        printArray(array);
    }

    public static void shuffle(ArrayList<Number> list) {
        System.out.println("\nArray is shuffled");
        for (int i = 0; i < list.size(); i++) {
            int randIndex = new Random().nextInt(list.size());
            Number value = list.get(i);
            Number value2 = list.get(randIndex);
            list.set(i, value2);
            list.set(randIndex, value);
        }
    }

    public static void printArray(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
