import java.util.*;

// Prints Smallest Number in Array
public class Array2 {
    public static void smallestNumber(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Numbers is : " + smallest);
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

        smallestNumber(numbers);

    }
}