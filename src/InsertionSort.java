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
        for(int i = 1; i < arr.length - 1; i++){
            int value = arr[i];
            int place = i;
            while(place > 0 && arr[place] > value){
                arr[place] = arr[place - 1];
                place = place - 1;
            }
            arr[place] = value;
        }
        System.out.print(Arrays.toString(arr));
    }
}
