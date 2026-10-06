import java.util.*;

// Optimized  
public class RepeatAndMissingNumbers2 {
    public static int[] repeatAndMissing(int grid[][]) {
        int n = grid.length; 

        int freq[] = new int[n * n + 1];
        for(int row=0; row<n; row++) {
            for(int cols=0; cols<n; cols++) {
                freq[grid[row][cols]]++;
            }
        }

        int repeating = -1;
        int missing = -1;
        for(int i=1; i<=n*n; i++) {

            if(freq[i] == 2) {
                repeating = i;
            }

            if(freq[i] == 0) {
                missing = i;
            }
        }
        return new int[]{repeating, missing};
    }
    public static void main(String args[]) {
        int grid[][] = {
            {9, 1, 7},
            {8, 9, 2},
            {3, 4, 6},
        };

        int result[] = repeatAndMissing(grid);
        System.out.println("Repeating Numbers is : " + result[0]);
        System.out.println("Missing Numbers is : " + result[1]);
    }
}