import java.util.*;

// Check Whether the given number is Prime or not
public class Assignment10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        boolean isPrime = true;
        if( n == 1) {
            System.out.println(" 1 is not Prime nor Composite");
        }else if(n <= 0) {
            System.out.println("Enter a Positive Number..");
        }else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if( n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(n + " is Prime");
            }else {
                System.out.println(n + " is Not Prime");
            }
        }
    }
}