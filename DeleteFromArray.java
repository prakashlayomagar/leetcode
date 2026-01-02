import java.util.Scanner;

public class DeleteFromArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Delete From Array");
    int[] numArray = inputArray();
    System.out.print("Please enter the number to delete from the array:");
    int elementToDelete = input.nextInt();
    int[] updatedArray = deleteElement(numArray, elementToDelete);
    System.out.println("The array after deleting " + elementToDelete + " is:");
    displayArray(updatedArray);
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
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

     public static int countOccurrences(int[] numArray, int target) {
        int count = 0;
        int i = 0;
        while (i < numArray.length) {
            if ( numArray[i] == target ) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static int[] deleteElement(int[] numArray, int elementToDelete) {
        int occurrences = countOccurrences(numArray, elementToDelete);
        if (occurrences == 0) {
            return numArray; 
        }

        int newSize = numArray.length - occurrences; 
        int[] newArray = new int[newSize];

        int i = 0;
        int j = 0;
        while (i < numArray.length) {
            if (numArray[i] != elementToDelete) {
                newArray[j] = numArray[i];
                j++;
            }
            i++;
        }   
        return newArray;
    }
}