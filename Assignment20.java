import java.util.*;

// // Area of Circle
public class Assignment20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius..");
        int radius = sc.nextInt();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println(area);

    }
}

