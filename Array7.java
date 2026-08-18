import java.util.*;

// Prints Max SubArray Sum - (Brute Force)
public class Array7 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += numbers[k];
                }
                System.out.print(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MaxSum is = " + maxSum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();


        int numbers[] = new int[n];
        System.out.println("Enter Numbers : ");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        maxSubarraySum(numbers);
    }
}