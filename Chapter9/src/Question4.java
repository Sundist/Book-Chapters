import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        int counter = 0;

        while (counter < 50) {
            System.out.println(rand.nextInt(100));
            counter++;
        }
    }
}
