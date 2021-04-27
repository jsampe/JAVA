import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        
        String employed[][] = {
            {"Jhon" , "Mary" , "David" , "Jessica"},
            {"Onwer" , "Arquited" , "Enginered" , "Teacher"}
        };
        
        for (String[] strings : employed) {
            System.out.println(Arrays.toString(strings));
            System.out.println("Hello");
        }
        
    }
    
}
