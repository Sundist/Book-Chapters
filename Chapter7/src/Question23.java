import java.util.Arrays;

public class Question23 {
    public static void main(String[] args) {
        int numberOfClosets = 100;
        int numberOfStudents = 0;
        int[] closets = new int[numberOfClosets + 1];

        Arrays.fill(closets, 0);
/*
        for (int i = 0; i < numberOfClosets; i++)
            closets[i] = 0;

 */

        while (numberOfStudents <= 100) {
            numberOfStudents++;
            for (int i = 1; i < closets.length; i++) {
                if (i % numberOfStudents == 0) {
                    if (closets[i] == 1)
                        closets[i] = 0;
                    else
                        closets[i] = 1;

                }
            }
            for (int i = 1; i < numberOfClosets + 1; i++)
                System.out.print(closets[i] + " ");
            System.out.println();
        }

        for (int i = 1; i < numberOfClosets + 1; i++)
            if (closets[i]  == 1)
                System.out.print(i+ " ");

        System.out.println();

    }

}
