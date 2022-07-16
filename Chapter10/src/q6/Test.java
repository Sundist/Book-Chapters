package q6;

import q5.StackOfIntegers;


public class Test {
    public static void main(String[] args) {
        System.out.print("prime numbers below 120 ");
        System.out.println();
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i);
                System.out.print(stack.peek() + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
