public class StringsThinks {

    public static void main(String[] args) {

        String MyName   = "Bilbo";
        String LastName = "Bolson";

        System.out.println(MyName);
        System.out.println(MyName.length());
        System.out.println(MyName.charAt(3));

        System.out.println(
            "My full name are " + MyName + " " + LastName 
            );
        
        String FullName = MyName + LastName;
        int LastLetter = FullName.length();
        
        System.out.println(LastLetter);
    
        System.out.println(FullName.charAt(LastLetter -1));
        
        String Sentece="To be or not to be, thas is the question";

        System.out.println(Sentece.substring(3, 5));

        //Compare two passwords.

        String password_1, password_2;

        password_1 = "Bilbo";
        password_2 = "bilbo";

        System.out.println(password_1.equals(password_2));
        System.out.println(password_1.equalsIgnoreCase(password_2));
        
    }
}
