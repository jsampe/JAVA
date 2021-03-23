/**
 * Example array with included type conversion.
 */
public class ArraySimple {
    public static void main(String[] args) {
        // Define an empty array of ten elements. 
        int sample[] = new int[10];
        // Define variable i as zero.
        int i = 0;
        // Define the variable ch as the letter A.
        char ch = 'A';
        
        for (int j = 0; j < 10; j++) {
            // The element i of the matrix takes the value of the letter in ch, A.
            sample[i] = ch;
                //Convert i to char to show the letter.    
                char chout = (char)sample[i];
            System.out.println("j value are: " + j + " matrix value are: " + chout);
            ++ch;
        }
    }
}