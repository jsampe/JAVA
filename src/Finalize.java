class FDemo {

    // Class variables.
    int x;

    // Constructor of the class.
    FDemo(int i) {
        x = i;
    }

    // Class method. Invoked when receiving an object, to see progress.
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    // Class method. It generates an object that is destroyed as soon as it is
    // created.
    void generator(int i) {
        new FDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {

        int count; // We define count to be used as a variable in the for.
        FDemo ob = new FDemo(0); // We create an object of class FDemo.

        // We generate objects to see how the garbage collector works.
        for (count = 1; count < 1000000; count++) {
            ob.generator(count);
        }

    }

}