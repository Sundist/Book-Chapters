package q2;

public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    Faculty(String name, String address, String phoneNumber, String email, String office, double salary,int officeHours, String rank) {
        super(name, address, phoneNumber, email,office,salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}
