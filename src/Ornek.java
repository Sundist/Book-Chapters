
public class Ornek {
    public static void main(String[] args) {
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);
    }
}
/* Hatanın nedeni sınıf COMPARABLE değil */

class Person /* //implements Comparable<Person> */ {
    private int id;

    Person(int id) {
        this.id = id;
    }
/*
    @Override
    public int compareTo(Person o) {
        if (this.id > o.id)
            return 1;
        else if (this.id < o.id)
            return -1;
        return 0;
    }*/
}

