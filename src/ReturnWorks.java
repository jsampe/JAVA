/**
 * Show how return works
 */

public class ReturnWorks {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            // Return works like a break point here.
            if (i == 5) return; // Stops on i=5;
            System.out.println(i);  
        }
    
    }

}
