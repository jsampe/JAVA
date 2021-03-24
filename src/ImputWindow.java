/**
 * Shows the use of windows with java swing
 */

 // import the swing plug-in to use.
import javax.swing.JOptionPane;

public class ImputWindow {
    public static void main(String[] args) {
        
        // Show a window requesting your name.
        String UserName = JOptionPane.showInputDialog("Insert your name:");
        // Show a window requesting your age.
        String UserAge  = JOptionPane.showInputDialog("Insert your age:");

        // Convert string to int whit parseInt, not necesary here, use only two show type conversion.
        int AgeNumber = Integer.parseInt(UserAge);

        System.out.println("User: " + UserName + " Age: " + (AgeNumber));
        
    }    
}
