import java.util.Scanner;

public class LinearSearch {
    public static void main(String [] args) {
        System.out.print("Array Size: ");
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element number " + i + "? ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Element to be searched: ");
        int element = sc.nextInt();
        int searchIndex = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                searchIndex = i;
                found = true;
                break;
            }
        }
        if(found){
            System.out.print(element + " found at index " + searchIndex);
        }
        else{
            System.out.print("Element does not exist in the array");
        }
        sc.close();
    }
}
