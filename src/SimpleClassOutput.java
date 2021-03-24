/**
 * Shows the use of a class to print its result directly.
 */

// Here start the class.
public class SimpleClassOutput {
    // This class have this values.    
    int x=2, y=5, z=0;
    char ch = 'A';
    // This class has a method that prints the value of A.
    public SimpleClassOutput() {
        // Show the value of A such as sum of x+y+z
        System.out.print(ch + "=");
        System.out.println(x+y+z);

    }
// End the class.

    public static void main(String[] args) {
        // Here the tip. To call the class an run only use new.
        new SimpleClassOutput();
    }
}