import java.util.Scanner;

public class MinMaxArray {
public static void main(String[] args) {
    System.out.println("Welcome to MinMax Array");
    int [] numArray = inputArray();

    int min = findMin(numArray);
    int max = findMax(numArray);
    System.out.println("The minimum value in the array is: " + min);
    System.out.println("The maximum value in the array is: " + max);
    
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

    public static int findMin(int[] numArray) {
        int min =  Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }


    public static int findMax(int[] numArray) {
        if (numArray.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
}