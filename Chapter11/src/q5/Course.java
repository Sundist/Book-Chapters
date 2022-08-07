package q5;

import java.util.ArrayList;

public class Course {
    private String course;
    private ArrayList<String> students;

    Course(String course) {
        this.course = course;
        students = new ArrayList<String>();
    }

    public String getCourseName() {
        return course;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public String[] getStudent() {
        String[] s = new String[students.size()];
        return students.toArray(s);
    }

    public int getNumberOfStudents() {
        return students.size();
    }
}