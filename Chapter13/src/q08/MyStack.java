package q08;

import java.util.ArrayList;

public class MyStack implements Cloneable {

    private ArrayList<Object> stack;
    private int size = 0;

    MyStack() {
        stack = new ArrayList<>();
    }

    public void push(Object o) {
        stack.add(o);
        size++;
    }

    public void pop() {
        stack.remove(stack.get(size - 1));
        size--;
    }

    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack.toString() +
                ", size=" + size +
                '}';
    }

    public ArrayList<Object> deepCopy() {
        ArrayList<Object> newArrayList = new ArrayList<>();
        for (Object o :
                stack) {
            newArrayList.add(o);
        }
        return newArrayList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyStack stack2 = (MyStack) super.clone();
        stack2.stack = deepCopy();
        return stack2;
    }
}
