import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurence Array");
        int[] numArray = inputArray();
        System.out.print("Please enter the number to find its occurrences:");
        int num = input.nextInt();
        int occurrences = countOccurrences(numArray, num);
        System.out.println("The number " + num + " occurs " + occurrences + " times in the array.");
    
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
