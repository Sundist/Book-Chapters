package q5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to display prime factors");
        int input = scanner.nextInt();
        int divisor = 2;
        StackOfIntegers stack = new StackOfIntegers();
        while (input != 1) {
            if (input % divisor == 0) {
                stack.push(divisor);
                input /= divisor;
                System.out.print(stack.peek() + " ");
            } else divisor++;
        }
        System.out.println();
        while (stack.getSize() > 0) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
