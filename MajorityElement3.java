import java.util.*;

public class MajorityElement3 {
    public static int majorityElement(int nums[]) {
        int frequency = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++) {
            if(frequency == 0) {
                ans = nums[i];
            }

            if(ans == nums[i]) {
                frequency++;
            }else {
                frequency--;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int nums[] = {2, 1, 1, 2,  1};

        System.out.println("Majority Element is : " + majorityElement(nums));
    }
}