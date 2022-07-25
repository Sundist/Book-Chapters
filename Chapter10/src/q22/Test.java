package q22;

public class Test {
    public static void main(String[] args) {
        char[] ch = {'a', ' ', 'c', 'm', 'g', ' ', 'h', 'A', 's', 'a', 'N'};
        MyString1 mystr = new MyString1(ch);
        MyString1 substr = mystr.substring(6, 11);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        substr = substr.toLowerCase();
        System.out.println();
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
    }
}
