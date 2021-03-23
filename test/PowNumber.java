/* Returns the value of the first argument raised
 to the power of the second argument*/

public class PowNumber {

    public static void main(String[] args) {
      
        int base;
        int exp;

        base = 5;
        exp  = 3;

        int result = (int) Math.pow(base, exp);

        System.out.println(
            "The outcome of " + base + " raised to " + exp + " are " + result
        );

    }
}
