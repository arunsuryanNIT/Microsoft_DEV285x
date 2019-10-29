import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        System.out.print("Capacity: ");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int [] arr = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Element number " + i + "? ");
            arr[i] = sc.nextInt();
        }
        boolean swapped;
        int j = 0;
        do{
            swapped = false;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            System.out.println("After iteration " + j + ": ");
            System.out.print(Arrays.toString(arr));
            System.out.println();
            j++;
        } while(swapped == true);
        sc.close();
    }
}
