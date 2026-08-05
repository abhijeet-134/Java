import java.util.*;

// Write a program that reads a set of integers and
//  then prints the sum of the even and odd integers.

// with for loop
public class Assignment25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for( int i=1; i<=n; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                evenSum += num;
            }else {
                oddSum += num;
            }
        }
        
        System.out.println("Sum of even numbers is = " + evenSum);
        System.out.println("Sum of odd numbers is = " + oddSum);
    }
}




// // with  do while loop 
// public class Assignment25 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int evenSum = 0;
//         int oddSum = 0;
//         int choice;

//         do {
//             System.out.println("Enter a Number:");
//             int number = sc.nextInt();

//             if (number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }

//             System.out.println("To continue press 1 or to exit press 0");
//             choice = sc.nextInt();  

//         } while (choice == 1);

//         System.out.println("Sum of even numbers is = " + evenSum);
//         System.out.println("Sum of odd numbers is = " + oddSum);
//     }
// }

