import java.util.*;

public class Array15 {
    public static boolean twice(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter Numbers :");
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        if(twice(nums)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}