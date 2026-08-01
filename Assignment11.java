import java.util.*;

// Count the total  Number of digits in a given integer 
public class Assignment11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if( n == 0) {
            System.out.println("Total  Number is 1");
        }else {
            int count = 0;
            while(n > 0) {
                n = n / 10;
                count++;
            }
            System.out.println("Total Number is " + count);
        }

    }
}

// public class Assignment11 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a Number:");
//         int n = sc.nextInt();
//         int count = 0;
//         while(n > 0) {
//             n = n / 10;
//             count++;
//         }
//         System.out.println("Total Number is :" + count);
//     }
// }