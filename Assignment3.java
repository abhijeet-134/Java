import java.util.*;

// // Input from user and Print its Cube..
public class Assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int cube =  n * n * n;
        System.out.println("Cube of " + n + " is = " + cube);
    }
}


// // Another way to find cube using java built in method Math.pow()
// public class Assignment3 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n =  sc.nextInt();
//         double cube = Math.pow(n ,3);
//         System.out.println("Cube of " + n + " is = " + cube);

//     }
// }