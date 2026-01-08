import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
    System.out.println("Welcome to Search 2D Array");
    Scanner input = new Scanner(System.in);
    int [][] array = input2DArray();
    System.out.print("Please enter the number to search:");
    int target = input.nextInt();
    boolean found = search2DArray(array, target);
    if (found) {
        System.out.println("Number found in the 2D array.");
    } else {
        System.out.println("Number not found in the 2D array.");
    }
    }

    public static boolean search2DArray(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns:");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Please enter element at position (" + i + "," + j + "):");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    
}
