package q10;

public class Queue {
    // TODO eksik
    private int[] elements;
    private int size;

    Queue() {
        size = 8;
        elements = new int[size];
    }

    public void enqueue(int v) {

    }

    public int dequeue() {

    }

    public boolean empty() {
        if (elements[0] == 0)
            return true;
        return false;
    }

    public int getSize() {
        return size;
    }
}
