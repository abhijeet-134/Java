import java.util.*;

// Binomial Coefficient
public class Assignment23 {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binoCoeff = fact_n / (fact_r * fact_nmr);
        return binoCoeff;


    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        // int factorial = factorial();
        // System.out.println(factorial);

        int result = binCoeff(n, r);
        System.out.println(result);

    }
}