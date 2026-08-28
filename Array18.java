import java.util.*;


public class Array18 {
    public static int trappedRainwater(int height[]) {
        // left Max Boundary 
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1; i<height.length; i++) {
            if(leftMax[i-1] > height[i]) {
                leftMax[i] = leftMax[i-1];
            }else {
                leftMax[i] = height[i];
            }
        }

        // right max boundary  
        int rightMax[] = new int[height.length];
        rightMax[height.length -1] = height[height.length -1];

        for(int i=height.length-2; i>=0; i--) {
            if(rightMax[i+1] > height[i]) {
                rightMax[i] = rightMax[i+1];
            }else {
                rightMax[i] = height[i];
            }
        } 


        // calculating trapped rainwater 
        int totalWater = 0;
        int waterLevel;
        for(int i=0; i<height.length; i++) {
            if(leftMax[i] < rightMax[i]) {
                waterLevel = leftMax[i];
            }else {
                waterLevel = rightMax[i];
            }

            int waterOnbar = (waterLevel - height[i]);
            totalWater += waterOnbar;
        }
        return totalWater;
    }
    public static void main(String args[]) {
        // int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int  height[] = {4, 2, 0, 3, 2, 5};
        int result = trappedRainwater(height);
        System.out.println("Trapped rain  water is = " + result);
    }
}