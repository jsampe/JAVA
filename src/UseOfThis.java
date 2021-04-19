// Working with THIS.

class UseOfThis {

    double b;
    int e;
    double val;

    // JAVA syntax allows the name of a local variable / parameter to match that of an instance variable.
    // In this case the local name hides the instance variable (there are two b's), we are told that we want to access the hidden one with THIS.
    UseOfThis (double b, int e) {
        this.b = b;
        this.e = e;

        val = 1;
        if (e == 0) return;
        for ( ; e > 0 ; e--) {
            val = val * b;
        }
    }

    double get_pwr() {
        return val;
    }

}

class DemoPwr {
    public static void main(String[] args) {
        UseOfThis x = new UseOfThis(4.0, 2);
        UseOfThis y = new UseOfThis(2.0, 3);
        UseOfThis z = new UseOfThis(5.0, 6);

        System.out.println(x.get_pwr());
        System.out.println(y.get_pwr());
        System.out.println(z.get_pwr());
    }
}