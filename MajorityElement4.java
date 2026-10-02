import java.util.*;

// If no majority element exists, return -1.
public class MajorityElement4 {
    public static int majorityelement(int nums[]) {
        int frequency = 0;
        int ans = nums[0];

        for(int i=0; i<nums.length; i++) {
            if(frequency == 0) {
                ans = nums[i];
                frequency = 1;
            }else if(ans == nums[i]) {
                frequency++;
            }else {
                frequency--;
            }
        }

        frequency = 0;
        for(int i=0; i<nums.length; i++) {
            if(ans == nums[i]) {
                frequency++;
            }
        }
        if(frequency > nums.length/2) {
            return ans;
        }
        return -1;

    }
    public static void main(String args[]) {
        int nums[] = {2, 3, 1, 1, 2, 1};

        System.out.println(majorityelement(nums));
    }
}