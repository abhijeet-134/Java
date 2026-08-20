import java.util.*;

// Prints MaxSum - (Kadane's algorithm)
public class Array9 {
    public static void kadanes(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            currSum  += numbers[i];

            if(currSum < 0) {
                currSum = 0;
            }
            System.out.println(currSum);

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("MaxSum is = " + maxSum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers[] = new int[n];
        System.out.println("Enter Numbers : ");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        kadanes(numbers);

    }
}