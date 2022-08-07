package q7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arr.add(i);
        System.out.println(arr);
        shuffle(arr);
    }

    public static void shuffle(ArrayList<Integer> list) {
        ArrayList<Integer> l = new ArrayList<>();
        Random rand = new Random(9);
        l = (ArrayList<Integer>) list.clone();
        l.toArray();
        for (int i = 0; i < list.size(); i++) {
            list.add(i, l.get(rand.nextInt()));
        }
    }

}
