import java.util.*;

// Reverse the given number
public class Assignment12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = n;
        int rev = 0;
        while(n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.print("Reverse of " + a + " is " + rev);
    }
}
