package q28;

public class Test {
    public static void main(String[] args) {
        MyStringBuilder2 str1 = new MyStringBuilder2("DenemeStringiBu");
        MyStringBuilder2 str2 = str1.insert(3, str1);
        System.out.println("Reverse string 1: " + str1.reverse());

    }
}
