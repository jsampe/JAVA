/**
 * Shows the min a max of a group of numbers.
 */

public class ArrayMinMax {
    public static void main(String[] args) {
        // Define m as array of numbers.
        int m[] = {25,52,18,91,11,5};

        // This only show every number of the array tabulated \t
        // using the .length of the array as control.
        // m[i] are the position of the element into the array, starting with 0 from the left.
        
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+"\t");
        }

        System.out.print("\n");
        
        // Define two variables, min and max.
        int min, max;
        // Assignments are made from right to left.
        // The value of first position m[0] are now the value of the max, and the value of the min are equal to the value of max.
        min = max = m[0];
        // This code show min and max values at this point, value now are 25.
        System.out.println(min); // Control
        System.out.println(max); // Control
        
        // Now the code that looks for the maximum value and the minimum.
        for (int i = 0; i < m.length; i++) {
            // Looks if the value are less than min, if it is, it is the new value of min.
            // Note the order of prevalence, the operation in parentheses is executed first.
            if (m[i] < min) min = m[i];
            // Looks if the value are more than max, if it is, it is the new value of max.
            if (m[i] > max) max = m[i];
            // Next
        }
        System.out.println("Minimum is: " + min + " maximum is: " + max);
    }
}