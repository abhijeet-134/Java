import java.util.*;

// Write a program that accepts two numbers from the user and prints
 // the greater number between them.
public class Assignment1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number..");
        int a = sc.nextInt();
        System.out.println("Enter a Second number..");
        int b = sc.nextInt();
        if(a > b) {
            System.out.println(a  + " is Greater..");
        }
        else if(b > a) {
            System.out.println(b + " is Greater..");
        }else {
            System.out.println("Both are Equal");
        }
    }
}