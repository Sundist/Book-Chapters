public class StringBuilderOrnegi {
    public static void main(String[] args) {
        final int N = 500_000_000;

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(N);
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder " + (end - start) + " ms surdu");
/*

        start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        end = System.currentTimeMillis();
        System.out.println("Stringle yapilinca " + (end - start) + " ms surdu");
*/
    }
}


/*
a
aa
aaa
aaaa
aaaaa
aaaaaa
aaaaaaa
aaaaaaaa
aaaaaaaaa
aaaaaaaaaa

 */