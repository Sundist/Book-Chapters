package q6;

import java.util.ArrayList;
import java.util.Date;

import q11.Circle2D;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<Object>();
        array.add(new Circle2D(1, 2, 3));
        array.add(new Date());
        for (Object ar : array
        ) {
            System.out.println(ar.toString());
        }
    }
}
