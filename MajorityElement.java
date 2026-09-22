    import java.util.*;

// Brute force 
public class MajorityElement {
    public static int majorityElement(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            int frequency = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    frequency++;
                }
                }
            if(frequency > nums.length/2) {
                System.out.println("Frequency is : " + nums[i]);
                return nums[i];
            }
        }
        return -1;
        }
        public static void main(String args[]) {
            int nums[] = {2,2,1,1,1,2,2};
            majorityElement(nums);
        }
    }
    

