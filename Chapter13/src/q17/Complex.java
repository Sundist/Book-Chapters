package q17;


public class Complex implements Cloneable {

    private double a;
    private double b;

    Complex() {
        a = 0;
        b = 0;
    }

    Complex(double a) {
        this.a = a;
    }

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex c) {
        return new Complex(this.getRealPart() + c.getRealPart(),
                this.getImaginaryPart() + c.getImaginaryPart());
    }

    public Complex subtract(Complex c) {
        return new Complex(this.getRealPart() - c.getRealPart(),
                this.getImaginaryPart() - c.getImaginaryPart());
    }

    public Complex multiply(Complex c) {
        return new Complex(this.getRealPart() * c.getRealPart(),
                this.getImaginaryPart() * c.getImaginaryPart());
    }

    public Complex divide(Complex c) {
        return new Complex(this.getRealPart() / c.getRealPart(),
                this.getImaginaryPart() / c.getImaginaryPart());
    }

    public double abs() {
        return (double) Math.sqrt(Math.pow(this.getRealPart(), 2) + Math.pow(this.getImaginaryPart(), 2));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return a + ((b == 0) ? "" : " + " + b + "i");
    }
}
