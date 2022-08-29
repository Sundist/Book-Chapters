package q11;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

    private double side;

    public Octagon() {
    }

    @Override
    public Object clone(Octagon o) throws CloneNotSupportedException {
        return null;
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public double getArea() {
        return side * side * (2 + 4 / Math.sqrt(2));
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Octagon{" +
                "side=" + side +
                ", area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}
