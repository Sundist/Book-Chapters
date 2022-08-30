package q08;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack start = new MyStack();

        start.push(new String("One"));
        start.push(new String("Two"));
        start.push(new String("Three"));

        MyStack cloned = (MyStack) start.clone();

        System.out.println("Is the cloned stack a shallow copy of the starting stack?");
        System.out.println(cloned == start);

        System.out.println("ANLAMADIĞIM BİR SIKINTI VAR!");
        System.out.println("\nCloned " + cloned.toString());
        System.out.println("\nOriginal " + start.toString());
    }
}
