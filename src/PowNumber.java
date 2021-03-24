/** 
 * Returns the value of the first argument raised to the power of the second argument.
 */

public class PowNumber {

    public static void main(String[] args) {
    
        // Define two variables, as the base and exponent of a pow.
        int base;
        int exp;

        // Asign values, five to the power of three.
        base = 5;
        exp  = 3;

        // Use pow() that returns a double, and convert to int.
        int result = (int) Math.pow(base, exp);

        System.out.println(
            "The outcome of " + base + " raised to " + exp + " are " + result
        );

    }
}