import java.util.*;

// public class Array5 {
//     public static void pairsArray(int numbers[]) {
//         for(int i=0; i<numbers.length; i++) {
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//             }
//             System.out.println();
//         }
//     } 
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         pairsArray(numbers);
//     }
// }

public class Array5 {
    public static void pairsArray(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
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

        pairsArray(numbers);
    }
}