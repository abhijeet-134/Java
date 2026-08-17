import java.util.*;

// Print Subarrays
public class Array6 {
    public static void printSubarrays(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k]  + " ");
                }
                System.out.println();
            }
            System.out.println();
    }
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
        printSubarrays(numbers);

        int totalSubarrays = n * (n + 1) / 2;
        System.out.println("Total Subarray is :" + totalSubarrays);
    }
}