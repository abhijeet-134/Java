import java.util.*;

public  class Array11 {
    public static int trappingRainWater(int height[]) {
        // calculate leftMax Boundary 
        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            if(leftMax[i-1] >  height[i]) {
                leftMax[i] = leftMax[i-1];
            }else {
                leftMax[i] = height[i];
            }
        }

        // Calculate right Max boundary 
        int rightMax[] = new int[height.length];
        int last = height.length-1;
        rightMax[last] = height[last];
        for(int i=height.length-2; i>=0; i--) {
            if(rightMax[i+1] > height[i]) {
                rightMax[i] = rightMax[i+1];
            }else {
                rightMax[i] = height[i];
            }
        }

        int totalWater = 0;
        for(int i=0; i<height.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            int waterOnBar = waterlevel - height[i];
            totalWater += waterOnBar;
        }

        return totalWater;
    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total rainwater is = " + trappingRainWater(height));

    }
}