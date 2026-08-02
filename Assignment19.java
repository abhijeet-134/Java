import java.util.*;


// Prints  Reverse numbers  from 1 to N 
public class Assignment17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number :");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--) {
            System.out.println(i);
        }

    }
}

// Prints Number from 1 to N
// public class Assignment17 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter  Number :");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++) {
//             System.out.println(i);
//         }

//     }
// }
