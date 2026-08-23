import java.util.*;

public class Array12 {
    public static int trappingRainWater(int height[]) {
        // // calculate left max boundary 
        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // // Calculate right Max boundary 
        int rightMax[] = new int[height.length];

        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length -2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        } 

        // // Calculate trapped rain water 
        int trappedRainwater = 0;
        for(int i=0; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int waterOnBar = (waterLevel - height[i]);

            trappedRainwater += waterOnBar;
        }

        return trappedRainwater;

    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int result = trappingRainWater(height);
        System.out.println("Trapped Rain Water is = " + result);
    }
}