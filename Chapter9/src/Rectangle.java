public class Rectangle {

    double width;
    double height;

    public Rectangle() {
       this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}
