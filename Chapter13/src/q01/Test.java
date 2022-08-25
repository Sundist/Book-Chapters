package q01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("Please Enter the 3 sides of the triangle now: ");
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Now enter a color followed by true or false for if the triangle is filled: ");
        String color = input.next();
        boolean isFilled = input.nextBoolean();

        GeometricObject triangle = new Triangle(side1, side2, side3, color, isFilled);
        triangle.setFilled(isFilled);
        triangle.setColor(color);

        System.out.println(triangle.toString());
        System.out.println("The area of the triangle is " + triangle.getArea() +
                "\nThe Perimeter of the triangle is " + triangle.getPerimeter() +
                "\nIts color is currently " + triangle.getColor() +
                "\nIts filled status is currently " + triangle.isFilled());
    }
}
