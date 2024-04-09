/*
 * this is the Palindrome program
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-04-09
 */

import java.util.Scanner;

/**
* This is the standard "MaxRunFunction" program.
*/
final class Palindrome {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Palindrome() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates if a string is a palindrome
    *
    * @param userString The user's input.
    *
    * @return isPalindrome is the string a palindrome
    */
    public static boolean palindrome(String userString) {
        String reversedString = "";
        final boolean isPalindrome;
        // reverse string
        for (int counter = userString.length() - 1; counter >= 0; counter--) {
            reversedString += userString.charAt(counter);
        }
        // check if string is palindrome (capitalization doesn't matter)
        if (userString.equalsIgnoreCase(reversedString.toString())) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        return isPalindrome;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        final String userString = scanner.nextLine().trim();

        // Error check
        if (userString.length() == 0) {
            System.out.println("Invalid input.");
        } else {
            // Process
            final boolean isPalindrome = palindrome(userString);
            // output
            if (isPalindrome) {
                System.out.println(userString + " is a palindrome.");
            } else {
                System.out.println(userString + " is NOT a palindrome.");
            }
        }

        System.out.println("\nDone.");
    }
}
