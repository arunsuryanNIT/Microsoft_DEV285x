import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String [] args) {
        System.out.print("Capacity: ");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element number " + i + "? ");
            arr[i] = sc.nextInt();
        }
        int i= 0, j = 0, value = 0, k = 0;
        for (i = 1; i < arr.length; i++)
        {
            value = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > value)
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
            System.out.println("After iteration " + k);
            System.out.println(Arrays.toString(arr));
        }
    }
}
