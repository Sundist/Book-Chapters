package q13;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course("Math");
        c1.addStudent("Hakan");
        c1.addStudent("Pir");
        c1.addStudent("Hike");
        c1.addStudent("WTF");
        c1.addStudent("Le");
        c1.addStudent("Tarkan");
        Course c2 = (Course) c1.clone();
        System.out.println(c1 == c2);
        c1.getStudents();
        c2.getStudents();


    }
}
