package q11;

public abstract class GeometricObject {

    private String color;
    private boolean filled;

    protected GeometricObject() {
        color = "red";
        filled = true;
    }

    protected GeometricObject(String color, boolean filled) {
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

    public abstract Object clone(Octagon o) throws CloneNotSupportedException;

    public abstract double getArea();

    public abstract double getPerimeter();
}

