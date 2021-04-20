class test {

    public static void main(String[] args) {
        
        int table[][] = new int[4][4];
        char ch = 'A';
        char ct = 'E';

        for (int i = 0; i < table.length; i++) {
            

            
            table[i] = ch;
            System.out.println((char)table[i]);
            ++ch;
        }        

    }
    
}