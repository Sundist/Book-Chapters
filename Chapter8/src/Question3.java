
public class Question3 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        Student[] studentGrades = grades(answers, keys);
        printStudent(studentGrades);

        sortedGrades(studentGrades);
        System.out.println("After sorting");
        printStudent(studentGrades);
    }

    private static void printStudent(Student[] studentGrades) {
        for (Student s : studentGrades) {
            System.out.println(s);
        }
    }

    public static Student[] grades(char[][] answer, char[] key) {
        Student[] gr = new Student[answer.length];
        for (int i = 0; i < answer.length; i++) {
            int score = 0;
            for (int j = 0; j < answer[0].length; j++) {
                if (answer[i][j] == key[j])
                    score++;
            }
            gr[i] = new Student(i, score);
        }
        return gr;
    }

    public static void sortedGrades(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].score() > arr[i].score()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
record Student (int id, int score) {
    @Override
    public String toString() {
        return "Student " + id + "'s correct answers : " + score;
    }
}
/*
class Student {
    int id;
    int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student " + id + "'s correct answers : " + score;
    }
}
*/