public class Foreach2 {
    public static void main(String[] args) {

        int numbers[] = { 1,2,3,4,5,6,7,8,9,10 };

        int sum = 0;

        for (int i : numbers) {
            System.out.println(i);
            sum += i;
            if (i==6) {
                break;
            }
        }
        System.out.println(sum);
    }
}
