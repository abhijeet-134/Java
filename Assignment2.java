import java.util.*;

// Input from user and accepting a square

public class Assignment2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int square = n * n;
        System.out.println("Square of " + n + " is = " + square);

    }
}