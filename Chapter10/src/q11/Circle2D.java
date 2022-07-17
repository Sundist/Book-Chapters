package q11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y) {
        if ((x > (getX() - radius) && y > (getY() - radius)) && (x < (getX() + radius) && y < (getY() + radius)))
            return true;
        return false;
    }

    public boolean contains(Circle2D c) {
        if ((c.radius < radius) && contains(c.x, c.y))
            return true;
        return false;
    }

    public boolean overlaps(Circle2D c) {
        double centerX = (c.x + getX()) / 2;
        double centerY = (c.y + getY()) / 2;
        double d = Math.sqrt(Math.pow(c.radius, 2) + Math.pow(getRadius(), 2));
        if ((getRadius() - c.radius) < d && d < (getRadius() + c.radius))
            return true;
        return false;
    }

}
