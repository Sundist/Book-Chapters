package q06;

public class ComparableCircle extends Circle implements Comparable<Circle> {

    private double radius;

    ComparableCircle() {
        super();
    }

    ComparableCircle(double radius) {
        super(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Circle o) {
        if (o.getArea() > this.getArea())
            return 0;
        return 1;
    }
}
