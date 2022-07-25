package q23;

public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = "";
        for (int i = 0; i < s.length(); i++) {
            this.s += s.charAt(i) + "";
        }
    }

    public int compare(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (this.s.charAt(i) < s.charAt(i)) return -1;
            else if (this.s.charAt(i) > s.charAt(i)) return 1;
        }
        return 0;
    }

    public MyString2 substring(int begin) {
        String sub = "";
        for (int i = begin; i < s.length(); i++)
            sub += s.charAt(i);

        return new MyString2(sub);
    }

    public MyString2 toUpperCase() {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                str += String.valueOf((char) (s.charAt(i) - 32));
            } else str += String.valueOf(s.charAt(i));
        }
        return new MyString2(str);
    }

    public char[] toChars() {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            chars[i] = s.charAt(i);
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        return (b ? new MyString2("true") : new MyString2("false"));
    }
}
