package q1;

public class Test {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
    }
}
