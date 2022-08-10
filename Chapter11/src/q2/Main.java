package q2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("ad", "adres", "", "email", StudentStatus.SENIOR);

        System.out.println(student.getStatus());
    }
}
