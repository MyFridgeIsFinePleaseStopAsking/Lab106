/**
 * Transcribed from the textbook "Data Structures and Algorithms in
 * Java" by Michael T. Goodrich; Robert Tamassia; Michael H. Goldwasser, code fragment 6.9
 * @author jmmot
 * @param <E> 
 */
public interface Queue<E> {
    /**
     * returns the number of elements in the queue.
     */
    int size();
    /**test whether the queue is empty.*/
    boolean isEmpty();
    /**inserts an element at the rear of the queue.*/
    void enqueue(E e) throws IllegalStateException;
    /**Returns, but does not remove, the first element of the queue(null if empty).*/
    E first();
    /**Removes and returns the first element of the queue(null if empty).*/
    E dequeue();
}