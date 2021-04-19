class Bubble {

    public static void main(String[] args) {
        
        int numbers[] = {99, -10, 100, 18, -978, 562, 463, 9, 287, 49};

        int position;   // Se refiere a la posición dentro de la matriz.
        int temp;       // Se usa para almacenar temporalmente el valor mayor.
       
        // Algoritmo, rucuerde que: Las comparaciones ">" se hacen se derecha a izquierda, y las asignaciones = de izquierda a derecha.

        for (int i=1; i < numbers.length; ++i) { // Recorre la matriz
            
            for ( position = numbers.length-1; position >= i; position-- ) {
            // Posición es igual al número de elementos de la matriz(10) -1, esto es la última posición, la [9].
            // Se ejecuta si la posición [9] es >= al valor de i(1), y decrece una posición.
                if (numbers[position-1] > numbers[position]) {
                // Empezando por el final, y de dos en dos. Comprueba si el valor de la izquierda es mayor que la de la derecha.
                    temp = numbers[position-1];
                    // Si el de la izquierda es mayor se almacena en la variable temp para no perderlo.
                    numbers[position-1] = numbers[position];
                    // Se copia el valor menor de la derecha hacia la izquierda. En este punto los dos valores son iguales.
                    numbers[position] = temp;
                    // Ahora copia en la posición de la derecha, el valor mayor, almacenado en temp. Ahora el menor esta a la izquierda.
                }
            }

        }

        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.printf( "%d \t", numbers[i] ); // Print ordered array.
        }
    }
}