import java.util.*;

// Prints Reverse Array 
public class Array4 {
    public static void reverseArray(int numbers[]) {
        int first = 0;
        int last = numbers.length -1;
        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter Numbers :");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        reverseArray(numbers);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}