package q07;



public class Test {
    public static void main(String[] args) {
        GeometricObject2 square = new Square();
        GeometricObject2 square1 = new Square(5.6);

        System.out.println(square.toString() + " ," + square1.toString());
        square1.howToColor();
    }
}
