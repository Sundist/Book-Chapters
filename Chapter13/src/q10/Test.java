package q10;

import q09.Circle;

public class Test {
    public static void main(String[] args) {
        GeometricObject rect1 = new Rectangle(5, 4, "red", true);
        GeometricObject rect2 = new Rectangle(5, 6, "red", true);
        GeometricObject rect3 = new Rectangle(2, 10, "blue", false);
        GeometricObject rect4 = new Rectangle(5, 4, "red", true);
        System.out.println("rect1 is " + (rect1.equals(rect2) ? "" : "not ") + "equal to rect2");
        System.out.println("rect1 is " + (rect1.equals(rect3) ? "" : "not ") + "equal to rect3");
        System.out.println("rect1 is " + (rect1.equals(rect4) ? "" : "not ") + "equal to rect4");

    }
}
