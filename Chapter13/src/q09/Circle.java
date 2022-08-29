package q09;

public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.radius)
            return 1;
        else if (this.radius < o.radius)
            return -1;
        return 0;
    }

    public boolean equals(Circle o) {
        return this.compareTo((Circle) o) == 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
