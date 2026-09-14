import java.util.*;

public class Sorting13 {
    public static int largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        System.out.print("largest element is : " + largest);
        return largest;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        largest(matrix);
    }
}

