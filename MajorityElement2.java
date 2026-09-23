import java.util.Arrays;

// Using Sorting approach 
public class MajorityElement2 {
    public static int majorityElement(int nums[]) {
        Arrays.sort(nums);
        Arrays.toString(nums);

        int frequency = 1; 
        int ans = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                frequency++;
            }else {
                frequency = 1; ans = nums[i];
            }

            if(frequency > nums.length/2) {
                System.out.println(nums[i]);
                return nums[i];
        }
    }

        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 2, 2,};

        majorityElement(nums);

    }
}