/**
 * Example of type conversion.
 */

public class TypeConversion {
    public static void main(String[] args) {

        // Define an empty array of 10 elements. 
        int sample[] = new int[10];
        
        // Define variable i as zero.
        int i = 0;
        // Define the variable ch as the letter A.
        // ASCII values are A,65,B,66,..J,74
        char ch = 'A';
        
        for (int j = 0; j < sample.length; j++) {
            // The element i of the array takes the value of the letter in ch.
            // sample[65] = A 
            sample[i] = ch;
                //Convert i,65, to char again to show the letter A.
                char chout = (char)sample[i];
            
            System.out.println("j value are: " + j + " matrix value are: " + chout);
            // Increse de value to next character.
            ++ch;
        }
    }
}