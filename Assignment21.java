import java.util.*;

// to calculate the circumference (perimeter) of a circle
public class Assignment21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius = sc.nextInt();
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);
    }
}