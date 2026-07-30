import java.util.*;


// // Sum of first N Natural Numbers - with while loop  
public class Assignment6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        int value = 1;
        while(value <= n) {
            sum =  sum + value;
            value++;
        }
        System.out.println(sum);
    }
}


// // Sum of first N Natural Numbers - with for loop  
// public class Assignment6 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1; i<=n; i++) {
//             sum  = sum + i;
//         }
//         System.out.println(sum);
//     }
// }

