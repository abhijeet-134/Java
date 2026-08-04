import java.util.*;


//Prints  Prime Number Range 
public class Assignment24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("1 is neither Prime nor Composite..");
        }else if(n <= 0) {
            System.out.println("Enter a Positive Number..");
        }else {
            System.out.println("Prime Numbers Are");
            for(int num = 2; num <=n; num++) {
                boolean isPrime = true;
                for(int i=2; i<=Math.sqrt(num); i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}