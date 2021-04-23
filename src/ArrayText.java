/*
* Show how Arrays works with Strings
*/

import java.util.Arrays;

public class ArrayText {

    public static void main(String[] args) {

        // Array of names, text.
        String[] names = {"Jhon" , "Mary" , "Smith" , "Jessica"};
        // Print one position.
        System.out.println(names[3]);
        // Use of for-eachs with Array of Strings.
        for (String string : names) {
            System.out.println(string);
        }
        // Use of Arrays to String Method for print the array formated.
        System.out.println(Arrays.toString(names));
        // Write new value in the position three.
        names[3] = "Dana";
        // Show of position three has been changed.
        System.out.println(Arrays.toString(names));
        // How to, count elemments of array (numbers/text).
        System.out.println(names.length);

    }
}