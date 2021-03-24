/**
 * Shows how two text strings can be compared.
 * Shows case sensitive and normal use:
 * .equals() is case sensitive.
 * .equalsIgnoreCase ignore upper case and lower case.
 */

public class CompareTwoPwd {

    public static void main(String[] args) {
        
        // Define two strings.
        String password_1, password_2;
        // Assign values upper case and lower case.
        password_1 = "BILBO";
        password_2 = "bilbo";
        // Compare and show false, are case sensitive.
        System.out.println(password_1.equals(password_2));
        // Compare and show true, ignore upper and lower case.
        System.out.println(password_1.equalsIgnoreCase(password_2));
    }
    
}