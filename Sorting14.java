import java.util.*;

public class Sorting14 {
    public static int smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                smallest = Math.min(largest, matrix[i][j]);
            }
        }
        System.out.print("smallest element is : " + smallest);
        return smallest;
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

        smallest(matrix);
    }
}
