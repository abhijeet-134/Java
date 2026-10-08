import java.util.*;

// Better Approach
public class SingleNumber {
    public static int singleNumber(int nums[]) {
        HashSet<Integer>set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
    public static void main(String args[]) {
        int nums[] = {4, 1, 2, 1, 2};

        System.out.println("Single Number is : " + singleNumber(nums));

    }
}