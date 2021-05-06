public class StringSwitch {
    public static void main(String[] args) {
        
        String command = "cancel";

        switch (command) {
            case "yes":
                System.out.println("You say yes !");
                break;
            case "not":
                System.out.println("You say not !");
            case "cancel":
                System.out.println("You cancel the action.");

            default:
                System.out.println("When you dont say anything. You say nothing");
                break;
        }

    }
}
