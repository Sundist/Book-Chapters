package q10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;

    Rectangle() {
    }

    Rectangle(double width, double n) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Rectangle o) {
        if (o instanceof Rectangle)
            return this.compareTo((Rectangle) o) == 0;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "," + super.toString() +
                '}';
    }
}
