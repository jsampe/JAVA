/*
* Multidimensional array for-each style.
*/

public class Array2foreach {

    public static void main(String[] args) {
        
        int[][] a = {
            {1,2,3},
            {4,5},
            {6,7,8,9},
        };

        for (int[] innerArray : a) {
            for (int data : innerArray) {
                System.out.println(data);
            }
        }

    }
    
}