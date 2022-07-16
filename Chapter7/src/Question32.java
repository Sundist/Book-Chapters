import java.util.Arrays;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter list: ");
        int size = scanner.nextInt();
        int[] liste = new int[size];
        for (int i = 0; i < size; i++)
            liste[i] = scanner.nextInt();

        System.out.println(partition(liste));


    }

    // 8  10  1  5  16  61  9  11  1
    public static int partition(int[] list) {
        int partition = list[0];
        int counter = 0;
        int index = 0;
        int indexMax = 0;
    //    System.out.println(partition + " " + list.length);
        for (int i = 0; i < list.length; i++) {
            if (list[i] < partition)
                counter++;
        }
     //   System.out.println(counter);
        int partitionIndex = 0;
        int[] minList = new int[counter];
        int[] maxList = new int[list.length - counter];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < partition) {
                minList[index] = list[i];
                //System.out.print(minList[index] + " ");
                index++;
            } else {
                maxList[indexMax] = list[i];
             //   System.out.print(maxList[indexMax] + " ");
                indexMax++;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (i < counter)
                list[i] = minList[i];
            else
                list[i] = maxList[i - maxList.length];
            if (partition == list[i])
                partitionIndex = i;
        }
        return partitionIndex;
    }
}
