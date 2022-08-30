package q12;

public class Test {
    public static void main(String[] args) {

        GeometricObject[] objects = {new Rectangle(2, 5), new Rectangle(20, 3),
                new Circle(5), new Circle(3)};
        for (GeometricObject i : objects)
            i.toString();
        System.out.println(sumArea(objects));

    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject i : a)
            sum += i.getArea();

        return sum;
    }
}
