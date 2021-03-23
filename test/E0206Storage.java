package Exercises;

public class E0206Storage {
    String s = "Hello, World!";
    int storage(String s) {
    return s.length() * 2;
    }
    void print() {
    System.out.println("storage(s) = " + storage(s));
    }
    public static void main(String[] args) {
    E0206Storage st = new E0206Storage();
    st.print();
    }
   }