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

    }
}
