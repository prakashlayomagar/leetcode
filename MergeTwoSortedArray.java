import java.util.Scanner;
public class MergeTwoSortedArray {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Merge Two Sorted Arrays");
        int [] array1 = inputArray();
        int [] array2 = inputArray();
        int [] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Merged Array:");
        displayArray(mergedArray);
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length || j < array2.length) {
            if ( j == array2.length || (i < array1.length && array1[i] < array2[j])) {
                mergedArray[k] = array1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = array2[j];
                k++;
                j++;
            }
        }

        return mergedArray;
    }

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements:");
        int size = input.nextInt();
        int[] numbers = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + " :");
            numbers[i] = input.nextInt();
            i++;
        }
    
        return numbers;
    }

    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
