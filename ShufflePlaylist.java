

/* Filename: Shuffle Playlist
 * Date: 9/30/2025
 * Author: Gabriel Cardenas
 */

import java.util.Scanner;

public class ShufflePlaylist {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInpEut(String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }



    public static void main(String[] args) {
        String[] songs = {"Shake It Off – Taylor Swift", "I Love You – Barney","Baby Shark – Pinkfong","Never Gonna Give You Up – Rick Astley","Axel F (Crazy Frog) – Crazy Frog", "Gangnam Style – PSY", "What Does the Fox Say? – Ylvis"};
        for (int i = 0; i < songs.length-1; i++)
        {
            int j = (int)(Math.random() * songs.length);
        
            String temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }
    
        System.out.println("Shuffled Playlist: ");
        for (int i = 0; i < songs.length; i++) {
            int counter = i + 1;
            System.out.println(counter + ". " + songs[i]);
        }
    }
}