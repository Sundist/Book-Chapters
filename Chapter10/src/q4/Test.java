package q4;


public class Test {
    public static void main(String[] args) {
        MyPoint myp = new MyPoint();
        MyPoint p1 = new MyPoint(10, 30.5);
        System.out.println(myp.distance(p1));
    }
}
