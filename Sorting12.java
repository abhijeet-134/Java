import java.util.*;

public class Sorting12 {
    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.print("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found...");
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int rows = matrix.length, cols = matrix[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);

    }
}
