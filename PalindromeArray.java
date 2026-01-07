import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker ");
        int [] numArray = inputArray();
        boolean isPalindrome = checkPalindrome(numArray);
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");   
    }
}

    public static boolean checkPalindrome(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            if (array[i] != array[(array.length - 1) - i]) {
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
