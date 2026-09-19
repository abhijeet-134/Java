import java.util.*;

// Print the number of 7’s that are in the 2d array.
public class Assignment29 {
    public static int duplicate(int matrix[][], int key) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    sum++;
                }
            }
        }
        System.out.print("Key occurence is :" + sum);
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{4, 7, 8},
                      {8, 8, 7}};

            int key = 7;

            duplicate(matrix, key);


    }
}