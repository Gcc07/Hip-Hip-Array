

/* Filename: Shuffle Playlist
 * Date: 10/2/25
 * Author: Gabriel Cardenas
 * Description: A program that randomly shuffles a playlist.
 */

import java.util.Scanner;

public class ShufflePlaylist {
    public static Scanner scanner = new Scanner(System.in);
    
    // 

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        // Init the songs string array
        String[] songs = {"Shake It Off – Taylor Swift", "I Love You – Barney","Baby Shark – Pinkfong","Never Gonna Give You Up – Rick Astley","Axel F (Crazy Frog) – Crazy Frog", "Gangnam Style – PSY", "What Does the Fox Say? – Ylvis"};
        for (int i = 0; i < songs.length-1; i++) // For an incremented number corresponding to the amount of songs in the array,
        {
            // Select a random number that will index a random song in the array
            int j = (int)(Math.random() * songs.length);
            // Store the temporarily replaced song currently being indexed
            String temp = songs[i];
            // Set the currently index song to the random song chosen earlier
            songs[i] = songs[j];
            // Set the randomly index song from earlier to the currently indexed song to replace it.
            songs[j] = temp;
        }
        // Print methods.
        System.out.println("Shuffled Playlist: ");
        for (int i = 0; i < songs.length; i++) {
            int counter = i + 1;
            System.out.println(counter + ". " + songs[i]);
        }
    }
}