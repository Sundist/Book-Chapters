package q2;

public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    Faculty(String name, String address, String phoneNumber, String email, String office, double salary, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" + super.toString() +
                "officeHours=" + officeHours +
                ", rank='" + rank + '\'' +
                '}';
    }
}
