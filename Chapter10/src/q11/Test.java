package q11;

public class Test {
    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D(1,1,3);
        Circle2D circle2 = new Circle2D(5, 5, 2);
        System.out.println(circle2.getX());
        System.out.println(circle2.getY());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.contains(10,-4));
        System.out.println(circle2.contains(circle1));
        System.out.println(circle2.overlaps(circle1));
    }
}
