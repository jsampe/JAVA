public class ArrayMinMax {
    public static void main(String[] args) {

        int m[] = {25,52,18,91};

        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+"\t");
        }

        System.out.print("\n");
        
        int min, max;
        min = max = m[0];
        //System.out.println(min); // Control
        for (int i = 0; i < m.length; i++) {
            if (m[i] < min) min = m[i];
            if (m[i] > max) max = m[i];
        }
        System.out.println("Minimum is: " + min + " maximum is: " + max);
    }
}