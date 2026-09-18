import java.util.*;

public class SearchinMatrix2 {
    public static boolean staircaseSearch2(int matrix[][], int key) {
        int rows = matrix.length-1;
        int cols = 0;

        while(rows >= 0 && cols < matrix[0].length) {
            if(matrix[rows][cols] == key) {
                System.out.println("Key found at (" + rows + "," + cols + ")");
                return true;
            }else if(key < matrix[rows][cols]) {
                rows--;
            }else {
                cols++;
            }
        }
        System.out.println("Key not found...");
        return false;

    }
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};


            int key = 20;

            staircaseSearch2(matrix, key);


    }
}