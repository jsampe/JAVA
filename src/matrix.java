public class matrix {
    public static void main(String[] args) {
        int sample[] = new int[10];
        int i;

        for ( i = 0; i < sample.length; i++ ) {
            sample[i] = i;
            System.out.printf("Muestra posiciones de la matriz %d \n", sample[i]);
        }
    }
}
