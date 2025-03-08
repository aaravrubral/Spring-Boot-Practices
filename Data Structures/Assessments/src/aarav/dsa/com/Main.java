package aarav.dsa.com;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this

        // Your code will be inside this main method
        // To view the output, just print the string

        // Initialize a boolean array to keep track of the alphabet letters
        boolean[] alphabet = new boolean[26];
        int index;

        // Convert the input line to lowercase to handle case insensitivity
        inputLine = inputLine.toLowerCase();

        // Iterate over each character in the input line
        for (int i = 0; i < inputLine.length(); i++) {
            char ch = inputLine.charAt(i);
            // Check if the character is a letter
            if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
                alphabet[index] = true;
            }
        }

        // Check if all letters of the alphabet are present
        boolean allLettersPresent = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                allLettersPresent = false;
                break;
            }
        }

        String result = allLettersPresent ? "true" : "false";

        // Below is the program output
        System.out.print(result);
    }
}
