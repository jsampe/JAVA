/**
 * Example of strings use.
 * Some simple exercises.
 */

public class StringsThinks {

    public static void main(String[] args) {
        // Define two strings whit your full name.
        String MyName   = "Bilbo";
        String LastName = "Bolson";

        // Print my name.
        System.out.println(MyName);
        // Print length of my name.
        System.out.println(MyName.length());
        // Print the position 4 (0123) of my name.
        System.out.println(MyName.charAt(3));
        // Use the + to concatenate.
        System.out.println(
            "My full name are " + MyName + " " + LastName 
            );
        // Create full name such as string compound of two strings.
        String FullName = MyName + LastName;
        // Print the full name.
        System.out.println(FullName);
        // Define the value of LastLetter as the last position of FullName. 
        int LastLetter = FullName.length();
        // As it has eleven letters, the last position is eleven.
        System.out.println(LastLetter);
        // TIP. To show the letter, convert the numeric value to char using charAt().
        System.out.println(FullName.charAt(LastLetter -1));
        // Define this pharse as string.
        String Sentece="To be or not to be, thast is the question";
        // Cuts between the positions and prints the result, remenber positions start on 0.
        System.out.println(Sentece.substring(3, 5));

        // Add new examples here.
        
    }
}
