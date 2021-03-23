import javax.swing.JOptionPane;

public class ImputWindow {
    public static void main(String[] args) {
        
        String UserName = JOptionPane.showInputDialog("Insert your name:");
        String UserAge  = JOptionPane.showInputDialog("Insert your age:");

        //Conver string to int whit parseInt
        int AgeNumber = Integer.parseInt(UserAge);

        System.out.println("User: " + UserName + " Age: " + (AgeNumber-18));

    }    
}
