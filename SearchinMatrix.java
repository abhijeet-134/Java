import java.util.*;

public class SearchinMatrix {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int cols = matrix[0].length-1;

        while(row < matrix.length &&  cols >= 0) {
            if(matrix[row][cols] == key) {
                System.out.print("Key Found at (" + row + "," + cols + ")");
                return true;
            }

            else if(key < matrix[row][cols]) {
                cols--;
            }else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

            int key = 33;

            staircaseSearch(matrix, key);
    }
}