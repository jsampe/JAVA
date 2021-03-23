public class ShowProperties {
    public static void main(String[] args) {
        //System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.print(System.getProperty("java.runtime.version"));        
    }
}
