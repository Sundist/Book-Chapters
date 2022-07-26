package q26;

public class Test {
    public static void main(String[] args) {
        String a = args[0].replaceAll(" ", "");
        a = a.replaceAll("[+]", "#+#");
        a = a.replaceAll("[-]", "#-#");
        a = a.replaceAll("[*]", "#*#");
        a = a.replaceAll("[/]", "#/#");
        args = a.split("#");
        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}
