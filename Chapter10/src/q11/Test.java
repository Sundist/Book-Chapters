package q11;

public class Test {
    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D();
        Circle2D circle2 = new Circle2D(5, 5, 6);
        System.out.println(circle2.getX());
        System.out.println(circle2.getY());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
    }
}
