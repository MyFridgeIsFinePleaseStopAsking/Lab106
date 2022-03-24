/**
 * Transcribed from the textbook "Data Structures and Algorithms in
 * Java" by Michael T. Goodrich; Robert Tamassia; Michael H. Goldwasser, code fragment 7.1
 * A simplified version of the java.util.List interface
 * @author jmmot
 * @param <E> 
 */
public interface List<E> {
    /**returns the number of elements in this list.*/
    int size();
    
    /**returns whether the list is empty.*/
    boolean isEmpty();
    
    /**returns (but does not remove) the element at index i.*/
    E get(int i) throws IndexOutOfBoundsException;
    
    /**Inserts element e to be at index i, shifting all subsequent elements later.*/
    E set(int i, E e) throws IndexOutOfBoundsException;
    
    /**Inserts element e to be at index i, shifting all subsequent elements later.*/
    void add(int i, E e) throws IndexOutOfBoundsException;
    
    /**removes/returns the element at index i, shifting subsequent elements earlier.*/
    E remove(int i) throws IndexOutOfBoundsException;
}
