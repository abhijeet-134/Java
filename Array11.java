import java.util.*;

// // Trapping Rain water code (with if -else)
public class Array11 {
    public static int trappedRainwater(int height[]) {
        // left Max boundary 
        int leftMax[] = new int[height.length];

        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            if(leftMax[i-1] > height[i]) {
                leftMax[i] = leftMax[i-1];
            }else {
                leftMax[i] = height[i];
            }
        }

        // // Right Max Boundary 
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

        // calculate trapped rain  water 
        int trappedRainwater = 0;
        int  waterLevel;
        for(int i=0; i<height.length; i++) {
            if(leftMax[i] < rightMax[i]) {
                waterLevel = leftMax[i];
            }else {
                waterLevel = rightMax[i];
            }

            int wateronBar = (waterLevel - height[i]);
            trappedRainwater  += wateronBar;
        }

        return trappedRainwater;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = sc.nextInt();

        int height[] = new int[n];
        System.out.println("Enter Numbers :");
        for(int i=0; i<height.length; i++) {
            height[i] = sc.nextInt();
        }

        // //int height[] = {4, 2, 0, 6, 3, 2, 5};

        int result = trappedRainwater(height);
        System.out.println("Trapped Rain Water is  = " + result);

    }
}