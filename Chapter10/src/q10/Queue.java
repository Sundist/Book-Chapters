package q10;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int size;
    final static int DEFAULT_CAPACITY = 8;

    Queue() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size > elements.length)
            elements = Arrays.copyOf(elements, DEFAULT_CAPACITY * 2);
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        int res = -1;
        if (size > 0) {
            res = elements[0];
            for (int i = 0, j = 1; j < getSize(); i++, j++)
                elements[i] = elements[j];
            size--;
        }
        return res;
    }

    public boolean empty() {
        if (getSize() == 0)
            return true;
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
