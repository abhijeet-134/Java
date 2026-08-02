import java.util.*;


// Check Number is Palindrome or Not
public class Assignment15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
        if(original == rev) {
            System.out.println(original + " is Palindrome...");
        }else {
            System.out.println(original + " is not a Palindrome...");
        }
    }
}