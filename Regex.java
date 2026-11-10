
/*
 * NAME: JAMES BRYAN G. CARO
 * SECTION: BSIT 2B
 */

import java.util.*;
import java.util.regex.*;

public class regex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n         PATTERN-MATCHING");
            System.out.println("================================");

            System.out.print("Enter a string: ");
            String string = sc.nextLine();

            System.out.println("\n=== VALIDATION RESULTS ===");

            // 1. Check if the string contains only digits
            System.out.println("1. Only digits: " + Pattern.matches("[0-9]+", string));

            // 2. Check if the string contains only letters
            System.out.println("2. Only letters: " + Pattern.matches("[a-zA-Z]+", string));

            // 3. Check if the string contains only letters and numbers
            System.out.println("3. Letters and numbers: "+ Pattern.matches("[a-zA-Z0-9]+", string));

            // 4. Check if the string starts with Java
            System.out.println("4. Starts with Java: " + string.matches("^Java.*"));

            // 5. Check if the string ends with .com
            System.out.println("5. Ends with .com: " + string.matches(".*\\.com$"));

            // 6. Check if the string contains exactly 5 digits
            System.out.println("6. Exactly 5 digits: " + string.matches("[0-9]{5}"));

            // 7. Check if the string contains at least 8 characters
            System.out.println("7. At least 8 characters: " + string.matches(".{8,}"));

            // 8. Check if the string contains whitespace using Pattern and Matcher
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(string);

            System.out.println("8. Contains whitespace: "
                    + matcher.find());

            System.out.println("\nPress Enter to Continue or type EXIT to quit:");
            String proceed = sc.nextLine();

            // Exit the program if the user types EXIT
            if (proceed.equalsIgnoreCase("EXIT")) {
                System.out.println("Program terminated.");
                break;
            }
        }

        sc.close();
    }
}
