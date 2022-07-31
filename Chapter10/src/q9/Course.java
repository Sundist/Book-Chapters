package q9;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] copied = new String[students.length * 2];
            for (int i = 0; i < students.length; i++)
                copied[i] = students[i];
            students = copied;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;

    }

    public void getStudents() {
        for (int i = 0; i < students.length; i++)
            System.out.println(students[i]);

    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
                if (i + 1 != numberOfStudents)
                    students[i] = students[i + 1];
            }
        }
        for (int i = numberOfStudents - 1; i < students.length; i++)
            students[i] = null;

        numberOfStudents--;
    }

    public void clear() {
        students = new String[3];
    }


}
