package q2;

public class Staff extends Employee {
    private String title;

    Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }
}
