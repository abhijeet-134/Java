import java.util.*;

// //  search in rotated sorted array using binary search 
public class Array16 {
    public static int binarySearch(int nums[], int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[start] <= nums[mid])  {
                if(target >= nums[start] && target < nums[mid]) {
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }else {
                    end = mid -1;
                }

            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = binarySearch(nums, target);

        if(result != -1) {
            System.out.println("Key found at index : " + result);
        }else {
            System.out.println("Key not found ");
        }

    }
}



