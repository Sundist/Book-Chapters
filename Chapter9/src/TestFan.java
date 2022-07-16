public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        System.out.print(fan1.toString());
        Fan fan2 = new Fan(3, true, 10, "yellow");
        System.out.print(fan2.toString());

    }
}
