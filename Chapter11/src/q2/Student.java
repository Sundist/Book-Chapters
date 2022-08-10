package q2;

public class Student extends Person {
    private StudentStatus status;

    Student(String name, String address, String phoneNumber, String email, StudentStatus status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public void setStatus(StudentStatus c) {
        this.status = status;
    }

    public String getStatus() {
        return status.getType();
    }

    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
