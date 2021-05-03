/*
* Stack FILO, First in last out.
* Queue FIFO, First in first out.
*/

class QueueArray {

    char q[]; // This array is the queue.
    int putlock, getlock; // Variables for index.

    QueueArray(int size) {
        q = new char[size+1]; // Memory allocation for the queue.
        putlock = getlock = 0; // Index stars at 0.
    }

    void put(char ch){
        if (putlock==q.length) {
            
        }
    }

}
