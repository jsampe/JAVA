public class StringAreObjects {
    
    // Java strings are objets.

    public static void main(String[] args) {
        
        String strobj1 = new String("Hello from object string");

        String strobj2 = new String("Hello from ovject string");

        System.out.println(strobj1);
        System.out.println(strobj2);

        System.out.println(strobj1.equals(strobj2));        

    }

}
