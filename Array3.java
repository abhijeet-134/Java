import java.util.*;

// Binary Search 
public class Array3 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String  args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter Numbers");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter key : ");
        int key = sc.nextInt();

        int result = binarySearch(numbers, key);

        if(result != -1) {
            System.out.println("Key found at index : " + result);
        }else {
            System.out.println("Key not found..");
        }
    }
}