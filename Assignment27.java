import java.util.*;

// // Decimal To Binary
public class Assignment27 {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int bin = 0;
        while(n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + myNum + " is = " + bin);
    }
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        decToBin(n);

    }
}