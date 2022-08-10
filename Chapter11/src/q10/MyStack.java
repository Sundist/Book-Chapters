package q10;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> stack;

    MyStack() {
        stack = new ArrayList<Object>();
    }

    public void push(Object obj) {
        stack.add(obj);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public Object top() {
        return stack.get(stack.size() - 1);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
