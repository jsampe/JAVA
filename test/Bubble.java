class Bubble {

    public static void main(String[] args) {
        
        int numbers[] = {99, -10, 100, 18, -978, 562, 463, 9, 287, 49};

        int p;    // Se refiere a la posición dentro de la matriz.
        int temp; // Se usa para almacenar temporalmente el valor mayor.
       
        // Algoritmo, rucuerde que: Las comparaciones ">" se hacen se derecha a izquierda, y las asignaciones = de izquierda a derecha.

        for (int i=1; i < numbers.length; ++i) { // Recorre la matriz de 

            for ( p = numbers.length-1; p >= i; p-- ) {
                if (numbers[p-1] > numbers[p]) { // Empezando por el final, y de dos en dos. Comprueba si el valor de la izquierda es mayor que la de la derecha.
                    temp = numbers[p-1]; // Si el de la izquierda es mayor se almacena en la variable temp para no perderlo.
                    numbers[p-1] = numbers[p]; // Se copia el valor menor de la derecha hacia la izquierda. En este punto los dos valores son iguales.
                    numbers[p] = temp; // Ahora copia en la posición de la derecha, el valor mayor, almacenado en temp. Ahora el menor esta a la izquierda.
                }
            }

        }

        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.printf( "%d \t", numbers[i] ); // Print ordered array.
        }
    }
}