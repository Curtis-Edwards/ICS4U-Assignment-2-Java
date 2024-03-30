/*
 * Given a string, returns the length
 * of the largest run in the string.
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-03-30
 */

import java.util.Scanner;

/**
* This is the standard "MaxRunFunction" program.
*/
final class MaxRun {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private MaxRun() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates the max run of a string.
    *
    * @param userString The user's input.
    *
    * @return maxRun The max run of the string
    */
    public static int maxRunFunction(String userString) {
        int maxRun = 1;
        int currentRun = 1;

        for (int i = 0; i < userString.length() - 1; i++) {
            if (userString.charAt(i) == userString.charAt(i + 1)) {
                currentRun++;
                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }
            } else {
                currentRun = 1;
            }
        }
        return maxRun;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // Input
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String userString = scanner.nextLine().trim();

        // Error check
        if (userString.length() == 0) {
            System.out.println("Invalid input.");
        } else {
            // Process
            final int maxRun = maxRunFunction(userString);

            // Output
            System.out.print("The string \"" + userString);
            System.out.println("\" has a max run of " + maxRun + "!");
        }

        System.out.println("\nDone.");

    }
}
