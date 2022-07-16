import java.util.Arrays;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        int[] array = new int[100000];

        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        StopWatch sw = new StopWatch();
        sw.start();
        Arrays.sort(array);
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }
}
