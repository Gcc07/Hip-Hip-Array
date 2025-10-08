/* Filename: MaxDifference
 * Date: 10/2/25
 * Author: Gabriel Cardenas
 * Description: A program that prints the difference between a maximum and a minimum of a collection of provided numbers.
 */

import java.util.Scanner;


public class MaxDifference {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    // Method that returns the maximum difference of the maximum and the minimum of numbers in an int array.
    public static int MaxDifference(int[] inputArray) {
        int current_max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) { // sets current max to the largest number
            if (inputArray[i] > current_max) {
                current_max = inputArray[i];
            }
        }
        int current_min = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) { // sets current min to the smallest number
            if (inputArray[i] < current_min) {
                current_min = inputArray[i];
            }
        }
        return (current_max - current_min); // Return the difference
    }

    public static void main(String[] args) {
        String Input = getInput("Enter any number of integers (at least two) seperated by spaces. ");
        String stringRegex = "[\\s]";
        String[] stringNumArray = Input.split(stringRegex);
        int[] intArray = new int[stringNumArray.length];
        for (int i = 0; i < stringNumArray.length; i++) {
            intArray[i] = Integer.parseInt(stringNumArray[i]);
        }        
        int maximumDifference = MaxDifference(intArray); // Use method to get the max difference of the provided array
        System.out.println("Maximum difference: " + maximumDifference);
    }
}