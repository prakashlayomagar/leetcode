import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Array");
        int[] numArray = inputArray();
        reverseArray(numArray);
        System.out.print("The reversed array is: ");
        displayArray(numArray);
    }

    public static int[] reverseArray(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            int swap = array[i];
            array[i] = array[(array.length - 1 )- i];
            array[(array.length - 1)- i] = swap;
            i++;
        }
        return array;
    }


 public static void displayArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
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
