public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("For R1, w:  " + r1.width + ", h: " + r1.height + " Perimeter: " + r1.getPerimeter() + " Area: " + r1.getArea());
        System.out.println("For R2, w:  " + r2.width + ", h: " + r2.height + " Perimeter: " + r2.getPerimeter() + " Area: " + r2.getArea());
    }
}
