package q4;

public class MyPoint {

    private double x;
    private double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(x - myPoint.getX(), 2) + Math.pow(y - myPoint.getY(), 2));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

}
