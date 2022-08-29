package q05;

public abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color;
    private boolean filled;

    GeometricObject() {
        color = "red";
        filled = false;
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public static GeometricObject max(GeometricObject o, GeometricObject g) {
        if (o.compareTo(g) == 1)
            return o;
        return g;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() == o.getArea())
            return 0;
        else if (this.getArea() > o.getArea())
            return 1;
        return -1;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
