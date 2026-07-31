import java.util.*;

// Print Even Numbers From 1 To N
public class Assignment7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is Even");
            }
        }
    }
}


