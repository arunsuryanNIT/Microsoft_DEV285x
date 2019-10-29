import java.util.Scanner;

public class SelectionSort {
    public static void main(String [] args){
        System.out.print("Capacity: ");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int [] arr = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Element number " + i + "? ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            int j = i;
            int index = 0, smallest = 9999;
            while(j < arr.length){
                if(arr[j] < smallest){
                    smallest = arr[j];
                    index = j;
                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            System.out.println("After iteration " + i + ": ");
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
