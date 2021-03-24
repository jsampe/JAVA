/**
 * A simple text scanner which can parse primitive types and strings using regular expressions
 */

// Import only Scanner class to use.
import java.util.Scanner;

public class ScannerOptions {
    public static void main(String[] args) {
        
        // This code allows a user to read a number from System.in the standart imput.
        Scanner keyboardImput = new Scanner(System.in);

        // Show text.
        System.out.println("Insert your name:");
        // Capture what you type until you press enter
        String userName = keyboardImput.nextLine();
        // Show text.
        System.out.println("Insert your age:");
        // Capture what you type until you press enter
        int userAge  = keyboardImput.nextInt();

        // Print your key imputs.
        System.out.println(
            "My name are " + userName + " I'm " + userAge + " yeards old."
            );

        // Close the keyboard imput.
        keyboardImput.close();    

    }
}