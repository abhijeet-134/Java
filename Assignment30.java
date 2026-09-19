import java.util.*;

public class Assignment30 {
    public static int sum(int matrix[][]) {
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++) {
                sum += matrix[1][j];
            }
            System.out.println("Sum of the second row is : " + sum);
            return sum;
        }    
    public static void main(String args[]) {
        int matrix[][] = {{1, 4, 9},
                          {11, 4, 3},
                          {2, 2, 3}};

            sum(matrix);
    }
}