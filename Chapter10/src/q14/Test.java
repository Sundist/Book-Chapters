package q14;

public class Test {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        MyDate myDate3 = new MyDate(561555550000L);
        System.out.println("MyDate1: year=" + myDate1.getYear() + " month=" + myDate1.getMonth() + " day=" + myDate1.getDay());
        System.out.println("MyDate2: year=" + myDate2.getYear() + " month=" + myDate2.getMonth() + " day=" + myDate2.getDay());
        System.out.println("MyDate3: year=" + myDate3.getYear() + " month=" + myDate3.getMonth() + " day=" + myDate3.getDay());

    }
}
