import java.util.*;

public class PowXN {
    public static double myPow(double x, int n) {
        long binForm = n;
        double ans = 1.0;
        double base = x;

        if(n < 0) {
            base = 1.0/base;
            binForm = -binForm;
        }


        while(binForm > 0) {
            if(binForm % 2 == 1) {
                ans *= base;
            }
            base *= base;
            binForm /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}