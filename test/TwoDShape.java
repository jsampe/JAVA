public class TwoDShape { // Superclass
 
    double width;
    double heigth;

    void showDim() {
        System.out.println(width + " and " + heigth);
    }
    
}

class Triangle extends TwoDShape { // Extended class from main class

    String style;

    double area() {
        return width * heigth / 2; // Variables from main class could be used as class variables.
    }

    void showStyle() {
        System.out.println(style);
    }

}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        // Triangle t2 = new Triangle();

        t1.width  = 4;
        t1.heigth = 4;
        t1.style  = "Isoceles";

        System.out.println("Triangle are:");
        t1.showDim();                  // From Super Class
        t1.showStyle();                // Inherited from Super Class
        System.out.println(t1.area()); // From Sub Class

    }
}