/**
 * Shows how a value is passed, by parameter, to a class.
 */

class ReturnByParameter {
    // Boolean could be, true or false. isEvent accept one paramenter. A integer number.
    boolean isEven(int x) { 
        // Return true if is even.
        if((x%2) ==0) return true;
        // If not even return false.
        else return false;
    }
}

class evenTest {
    public static void main(String[] args) {
        // Create n as object of test classs.
        ReturnByParameter n = new ReturnByParameter();
        // Check condition for the teen first numbers.
        for (int i = 0; i < 10; i++) {
            // Call isEven for i and check.
            if(n.isEven(i)) {
                // Print if is true.
                System.out.printf("%d is Even %b \n",i,n);
            }
            // Call isEven for i and check.
            if(n.isEven(i)  ==false) {
                // Print if is odd.
                System.out.printf("%d is odd %b \n",i,n);
            }
        }
    }
}