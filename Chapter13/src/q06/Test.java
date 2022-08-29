package q06;

public class Test {
    public static void main(String[] args) {
        ComparableCircle cc = new ComparableCircle();
        ComparableCircle cc1 = new ComparableCircle(4);
        ComparableCircle cc2 = new ComparableCircle(4.5);

        System.out.println(cc.toString() + " " + cc1.toString() + " " + cc2.toString());
        System.out.println(cc.compareTo(cc1) + " " + cc.compareTo(cc2));
        System.out.println(cc1.compareTo(cc) + " " + cc1.compareTo(cc2));
        System.out.println(cc2.compareTo(cc) + " " + cc2.compareTo(cc1));
    }
}
