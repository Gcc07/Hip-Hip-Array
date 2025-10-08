/* Filename: EvenOddSplitter
 * Date: 10/2/25
 * Author: Gabriel Cardenas
 * Description: A program that takes an input from the user, and returns the odd and even numbers.
 */



import java.util.Scanner;

public class EvenOddSplitter {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) { 
        System.out.print(prompt);
        return scanner.nextLine();
    }
    // Function that returns the evens in a provided array
    public static int[] getEvens(int[] nums) {
        int evenCounter = 0;
        int indexCounter = 0;
        // get amount of evens within the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCounter += 1;
            }
        }
        int[] evenArray = new int[evenCounter]; // Initialize the list of evens w/ the size of the amount of evens.

        for (int i = 0; i < nums.length; i++) { // Fill even array.
            if (nums[i] % 2 == 0) {
                evenArray[indexCounter] = nums[i];
                indexCounter += 1;
            }
        }
        return evenArray;
    }
    // Function that returns the odds in a provided array (Same as even, only changing the division logic.)
    public static int[] getOdds(int[] nums) {
        int oddCounter = 0;
        int indexCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                oddCounter += 1;
            }
        }
        int[] evenArray = new int[oddCounter];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                evenArray[indexCounter] = nums[i];
                indexCounter += 1;
            }
        }
        return evenArray;
    }
    public static void main(String[] args) {
        String Input = getInput("Enter 15 integers with one space between each integer: ");
        String stringRegex = "[\\s]";
        String[] stringNumArray = Input.split(stringRegex);
        int[] intArray = new int[stringNumArray.length];
        for (int i = 0; i < stringNumArray.length; i++) {
            intArray[i] = Integer.parseInt(stringNumArray[i]);
        }
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        int[] even_array = getEvens(intArray);
        int[] odd_array = getOdds(intArray);
        System.out.print("\nEven numbers: ");
        for (int i : even_array) {
            System.out.print(i + " ");
        }
        System.out.print("\nOdd numbers: ");
        for (int i : odd_array) {
            System.out.print(i + " ");
        }
        
    }
}
