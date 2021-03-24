/**
 * Show the use of ShowProperties.
 */

public class ShowProperties {
    public static void main(String[] args) {
        
        // Show all the properties.
        System.getProperties().list(System.out);
        // Show only the user name.
        System.out.println(System.getProperty("user.name"));
        // Show only java version.
        System.out.print(System.getProperty("java.runtime.version"));        
    }
}
