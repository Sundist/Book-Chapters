import java.util.GregorianCalendar;

public class Question5 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.get(cal.YEAR) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.DAY_OF_MONTH));
        cal.setTimeInMillis(1234567898765L);
        System.out.println(cal.get(cal.YEAR) + "/" + cal.get(cal.MONTH) + "/" + cal.get(cal.DAY_OF_MONTH));

    }
}
