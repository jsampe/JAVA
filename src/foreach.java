/*
* Show differences betewn for-i and for-each.
* Both go through the array, but for-i can write values, and for-each only read, dont write.
*/

class Foreach {
    
    public static void main(String[] args) {
        // Here we use a classic for-i to fill the array, because is read/write function.
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = i; 
            System.out.print(n[i] + "\t");
            
        }
        // Here we use a for-each to go through the array, beacause is only read funtion.
        // The advantage is that you do not need to know where it begins, ends, or the number of elements.
        int sum = 0;

        for (int x : n) {
            System.out.print(n[x] + "\n");
            sum += x;
            // A classic use is a sum, it goes through all the values ​​and adds them.
        }
        
        System.out.println(sum);
    }

}