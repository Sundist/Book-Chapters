package q12;

import q4.MyPoint;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    Triangle2D() {
        p1 = new MyPoint(0.0, 0.0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public double getArea() {
        double ab = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        double ac = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
        double bc = Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2));
        double s = (ab + bc + ac) / 2;
        return Math.sqrt(s * (s - ab) * (s - ac) * (s - bc));
    }

    public double getPerimeter() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)) + Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2))
                + Math.sqrt(Math.pow(p3.getX() - p2.getX(), 2) + Math.pow(p3.getY() - p2.getY(), 2));
    }

    public boolean contains(MyPoint p) {
        double a = p2.getY() - p3.getY();
        double b = p3.getX() - p2.getX();
        double c = p3.getY() - p1.getY();
        double d = p2.getX() - p3.getX();
        double determinant = a * d - b * c;
        double maxDet = Math.max(determinant, 0);
        double minDet = Math.min(determinant, 0);
        double detOfx = p.getX() - p3.getX();
        double detOfy = p.getY() - p3.getY();
        double s = a * detOfx + b * detOfy;
        double t = c * detOfx + d * detOfy;
        double z = determinant - s - t;
        return !(s < minDet || s > maxDet) ||
                !(t < minDet || t > maxDet) ||
                !(z < minDet || z > maxDet);
    }

    public boolean contains(Triangle2D t) {
        return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
    }

    public boolean overlaps(Triangle2D t) {
        return contains(t.getP1()) || contains(t.getP2()) || contains(t.getP3());
    }

}
