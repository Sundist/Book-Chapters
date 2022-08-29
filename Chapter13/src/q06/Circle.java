package q06;

public abstract class Circle {
    protected double radius;

    protected Circle() {
        radius = 1;
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area= " + getArea() +
                ", Perimeter" + getPerimeter() +
                '}';
    }

    public abstract int compareTo(Circle c);

}
