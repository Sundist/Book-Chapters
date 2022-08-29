package q07;

public class Square extends GeometricObject2 {

    private double l;

    Square() {
        super();
    }

    Square(double l) {
        this.l = l;
    }

    @Override
    public double getArea() {
        return l * l;
    }

    @Override
    public double getPerimeter() {
        return 4 * l;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
