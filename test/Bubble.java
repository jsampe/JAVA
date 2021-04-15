class Bubble {

    public static void main(String[] args) {
        
        int nums[] = {99, -10, 100, 18, -978, 562, 463, 9, 287, 49};

        int a, b, t;
        //int size;

        //size = nums.length; // Number of elements to order.

        // Shows original array.
        for ( int i = 0; i < nums.length; i++ ) {
            System.out.printf( "%d \t", nums[i] );
        }

        System.out.println("\n Now ordered:");

        // Bubble order.
        for ( a=1; a < nums.length; ++a) {
            for ( b=nums.length-1; b >= a; b-- ) {
                if (nums[b-1] > nums[b]) { // If no are in order, change elements.
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        for ( int i = 0; i < nums.length; i++ ) {
            System.out.printf( "%d \t", nums[i] );
        }

    }
    
}