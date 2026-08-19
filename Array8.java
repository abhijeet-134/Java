import java.util.*;

// Prints Max SubArray Sum -(prefix sum Method)
public class Array8 {
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                System.out.println(currSum);
            }
            System.out.println();

        }
        System.out.println("MaxSum is = " + maxSum);
    }
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter Numbers :");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        maxSubarraySum(numbers);

    }
}