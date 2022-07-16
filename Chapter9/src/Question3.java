import java.util.Date;

public class Question3 {
    public static void main(String[] args) {
        Date date = new Date();
        //10000, 100000, 1000000, 10000000, 100000000, 1000000000,        *
        // 10000000000, and 100000000000
        System.out.println("For 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000");
        for (long j = 10000; j <= 10_000_000_000_000L; j *= 10) {
            date.setTime(j);
            System.out.println(date + " ");
        }

        date.setTime(Long.MAX_VALUE);
        System.out.println(date + " ");
    }
}
