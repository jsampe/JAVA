/**
 * Shows how a value is passed, by two parameters, to a class.
 */

class TestFactor {
    // Boolean could be, true or false. isFactor accept two paramenters. As integer numbers.
    boolean isFactor(int a, int b) { 
        // Return true if are factor.
        if((a % b) ==0) return true;
        // If not factor return false.
        else return false;
    }
}

class ReturnTwoParameters {
    public static void main(String[] args) {
        // The number to check his factors.
        int x = 12;

        // Create f as object of test classs.
        TestFactor f = new TestFactor();

        // Check condition for the teen first numbers.
        for (int i = 1; i < 10; i++) {
            // Call isFactor for i and check.
            if(f.isFactor(x, i)) {
                // Print if is true.
                System.out.printf("%d is Factor %b \n",i,f);
            }
            // Call isFactor for i and check.
            if(f.isFactor(x, i)  ==false) {
                // Print if is not factor.
                System.out.printf("%d is not %b \n",i,f);
            }
        }
    }
}