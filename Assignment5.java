import java.util.*;

// Prints Multiplication Table
public class Assignment5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            int table = n * i;
            System.out.println(n +  " * " + i + " = " + table);
        }

    }
}