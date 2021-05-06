public class ArgumentsClass {
    
    public static void main(String[] args) {
        
        String numberString[][] = {
            {"Tom","555"},
            {"Mary","666"},
            {"Jon","777"}
        };

        //int i;

        if (args.length != 1) { // One argument are required.
            System.out.println("Use: java ClassName <Person Name>");
        } else {
            for (int i = 0; i < numberString.length; i++) {
                if (numberString [i][0].equals(args[0])) {
                    System.out.println(numberString[i][0] + " " + numberString[i][1] );
                    break;
                }
            }
        }

    }

}
