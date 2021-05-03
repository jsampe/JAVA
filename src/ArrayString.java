import java.util.Arrays;

public class ArrayString {

    public static void main(String[] args) {
        
        String employed[][] = {
            {"Jhon" , "Mary" , "David" , "Jessica"},
            {"Onwer" , "Arquited" , "Enginered" , "Teacher"}
        };
        
        for (String[] strings : employed) {
            System.out.println(Arrays.toString(strings));
        }
        System.out.println(employed[1][1]);

        System.out.println(employed.length);
        System.out.println(employed[0].length);
        System.out.println(employed[1].length);
    }
    
}
