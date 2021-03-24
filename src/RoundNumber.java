/**
 * Show the use of .sqrt() and .round()
 */

public class RoundNumber{

    public static void main(String[] args) {

        // Define one variable of double type.
        double r = 15;
        // Use Math.sqrt() to calculate the square of r.
        double raiz=Math.sqrt(r);

        // result without rounding.
        System.out.println(raiz);
        // rounded result.
        System.out.println(Math.round(raiz));

    }
    
}
