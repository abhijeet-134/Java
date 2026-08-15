import java.util.*;

public class Arrays {
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        System.out.println("Enter Numbers :");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter key :");
        int key = sc.nextInt();

        int index = LinearSearch(numbers, key);

        if(index != -1) {
            System.out.println("Key found at index :" + index);
        }else {
            System.out.println("Not Found..");
        }
    }
}