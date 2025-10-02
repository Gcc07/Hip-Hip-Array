/* Filename: MaxDifference
 * Date: 9/30/2025
 * Author: Gabriel Cardenas
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

    public static int MaxDifference(int[] inputArray) {
        int current_max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > current_max) {
                current_max = inputArray[i];
            }
        }
        int current_min = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < current_min) {
                current_min = inputArray[i];
            }
        }
        return (current_max - current_min);
    }

    public static void main(String[] args) {
        String Input = getInput("Enter any number of integers (at least two) seperated by spaces. ");
        String stringRegex = "[\\s]";
        String[] stringNumArray = Input.split(stringRegex);
        int[] intArray = new int[stringNumArray.length];
        for (int i = 0; i < stringNumArray.length; i++) {
            intArray[i] = Integer.parseInt(stringNumArray[i]);
        }        
        int maximumDifference = MaxDifference(intArray);
        System.out.println("Maximum difference: " + maximumDifference);
    }
}