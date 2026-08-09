import java.util.*;

// Binary To Decimal
public class Assignment26 {
    public static void binToDec(int n) {
        int myNum = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            n = n / 10;
        }
        System.out.println("Binary of " + myNum + " is = " + dec);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        binToDec(n);

    }
}