package q10;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.getSize());
        System.out.println(queue.empty());
        queue.enqueue(6);
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(2);
        System.out.println(queue.getSize());
        System.out.println(queue.empty());
        System.out.println(queue.toString());

    }
}
