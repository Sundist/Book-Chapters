package q9;

public class Test {
    public static void main(String[] args) {
        Course crs1 = new Course("COMP5590");
        crs1.addStudent("Hakan");
        crs1.addStudent("Can");
        crs1.addStudent("Tarık");
        System.out.println(crs1.getNumberOfStudents());
        crs1.getStudents();

        crs1.addStudent("Deniz");
        System.out.println(crs1.getNumberOfStudents());
        crs1.getStudents();

        crs1.dropStudent("Tarık");
        System.out.println(crs1.getNumberOfStudents());
        crs1.getStudents();

    }
}
