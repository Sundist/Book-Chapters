import java.util.Random;

public class Question20 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(150);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        reviseSelectionSort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reviseSelectionSort(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            int max = array[j];
            int indexMax = j;
            for (int i = j - 1; i >= 0; i--) {
                if (max < array[i]) {
                    max = array[i];
                    indexMax = i;
                }
            }
            if (indexMax != j) {
                array[indexMax] = array[j];
                array[j] = max;
            }
        }
        return array;
    }
}
