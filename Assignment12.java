import java.util.*;

// Sum of all digits of given number..
// public class Assignment12 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         int sum = 0;
//         while( n > 0) {
//             int lastdigit = n % 10;
//             sum = sum + lastdigit;
//             n = n / 10;

//         }
//         System.out.println("Sum of given Numbers is :" + sum);

//     }
// }

public class Assignment12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println("Sum of given Number is :" + sum);
    }
}


