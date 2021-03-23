import java.util.Scanner;

public class ScannerOptions {
    public static void main(String[] args) {
        
        Scanner keyboardImput = new Scanner(System.in);

        System.out.println("Insert your name:");
        String userName = keyboardImput.nextLine();
        System.out.println("Insert your age:");
        int userAge  = keyboardImput.nextInt();

        System.out.println(
            "My name are " + userName + " I'm " + userAge + " yeards old."
            );
        
        keyboardImput.close();        

    }
}