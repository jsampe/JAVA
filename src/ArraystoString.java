import java.util.Arrays;

/*
* Access an element that is inside an array and show the use of Array to String.
*/

public class ArraystoString {

    public static void main(String[] args) {

        int n[] = new int[10];

        // Fill the array.
        for (int i = 0; i < n.length; i++) {
            n[i] = i;
        }
        // Shows the array now.
        System.out.println("A = " + Arrays.toString(n));
        // Print the value of position nine.
        System.out.println("Print value of position nine " + n[9]);

        // Here change/write the value of position nine.
        n[9] = 50;

        // Print the value of position nine after update.
        System.out.println("Print value of position nine " + n[9]);
        // Show the array changed.
        System.out.println("A = " + Arrays.toString(n));

    }

}