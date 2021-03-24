import java.util.Random;
/**
 * Example array filled with random numbers in a hand-defined range.
 * It can be used to obtain a given amount of numbers between any range,
 * negative numbers included.
 */
public class RandomNumber {
    public static void main(String[] args) {
        // Defines a range between two numbers, min and max.
        int min = -100;
        int max =  100;
        // Defines an array of a given number of elements, this case ten.
        int m[] = new int[10];
        // We use a for to fill the array and .length to chosse the length of m[].
        for (int j = 0; j < m.length; j++) {
            // Creates mRandom such as object of the class Random.  
            Random mRandom = new Random();
            // Defines r as a number of type random between two values ​​min and max.
            int r = mRandom.nextInt(max - min) + min;
            // Prints the values ​​on the screen.
            System.out.println("min: " + min + " max: " + max + " for are: " + j + " randon number is: " + r);
        }
    }
}