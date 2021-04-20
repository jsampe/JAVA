public class truth_table {

    public static void main(String[] args) {

        boolean p, q; // Boolean values only could be TRUE or FALSE.
        int i;

        System.out.println("PQ \tAND \tOR \tXOR \tNOT \tAre Equals"); // Print table header.

        for (p = true, q = true, i = 0; i < 1; ++i) {

            System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + !p);
        
        }
    }
}