import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to IsSorted Array");
        int [] numArray = inputArray();
        boolean isIncreasing = isIncreasing(numArray);
        boolean isDecreasing = isDecreasing(numArray);

        if (isIncreasing) {
            System.out.println("The array is sorted in increasing order.");
        } else if (isDecreasing) {
            System.out.println("The array is sorted in decreasing order.");
        } else {
            System.out.println("The array is not sorted.");
        }

    }

    public static boolean isIncreasing(int[] numArray) {
        if (numArray.length == 0) {
            return false;
        }
        int i = 0;
        while (i < numArray.length - 1) {
            if (numArray[i] > numArray[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray) {
        if (numArray.length == 0) {
            return false;
        }
        int i = 0;
        while (i < numArray.length - 1) {
            if (numArray[i] < numArray[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
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


}
