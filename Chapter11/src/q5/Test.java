package q5;

public class Test {
    public static void main(String[] args) {
        Course c = new Course("Almanca");
        c.addStudent("Hakan");
        c.addStudent("tarik");
        c.addStudent("Can");
        c.addStudent("Lemo");
        c.addStudent("ney");
        System.out.println(c.getNumberOfStudents());
        c.getStudent();
        c.dropStudent("tarik");
        c.getStudent();
        System.out.println(c.getNumberOfStudents());

    }
}
