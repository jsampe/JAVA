package Exercises;

// First create class.
public class E0201_DefaultIni {
    //-------- create attributes.
    int i;
    char c;
    //-------- create funtions/methods.
    public E0201_DefaultIni() {
        System.out.println(i);
        System.out.println(c);
    }
// End class

    public static void main(String[] args) {
        //Call and run class
        new E0201_DefaultIni();
    }
}