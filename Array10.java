import java.util.*;

// // kadanes algorithm - Fix kadanes algorithm to handle negative arrays
public class Array10 {
    public static void kadanes2(int numbers[]) {
        int currSum = numbers[0];
        int maxSum = numbers[0];
        
        for(int i=1; i<numbers.length; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(currSum, maxSum);

            System.out.println(currSum);
        }
        System.out.println("Max Sum is = " + maxSum);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int numbers[] =  new int[n];
        System.out.println("Enter Numbers :");
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        kadanes2(numbers);

    }
}
