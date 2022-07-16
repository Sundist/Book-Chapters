package q10;

public class Queue {
    private int[] elements;
    private int size;

    Queue() {
        size = 8;
        elements = new int[size];
    }

    public void enqueue(int v) {

    }

    public void dequeue() {
    }

    public boolean empty() {
        if (elements[0] == 0)
            return true;
        return false;
    }

    public int getSize() {
        int numberOfElements = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0)
                numberOfElements++;
        }
        return numberOfElements;
    }
}
