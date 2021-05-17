public class AndOpe {
    public static void main(String[] args) {
        
        //int t;
        byte val;

        val = 15;

        for (int i = 128; i > 0; i = i/2) {
            
            if ((val & i) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }

        }

    }
}
