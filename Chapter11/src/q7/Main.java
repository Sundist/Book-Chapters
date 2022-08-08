package q7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(i * 2 + 1);
        System.out.println(arr);
        shuffle(arr);
    }

    public static void shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList = (ArrayList<Integer>) list.clone();
        list.clear();
        System.out.println("Shuffled:");
        for (int i = 0; i < newArrayList.size(); i++) {
            list.add(newArrayList.get((i * 3 + 7) % newArrayList.size()));
            System.out.print(list.get(i) + " ");
        }
    }

}
