/**
 * implemented from the Data structures and algorithms textbook, chapter 6, code fragment 6.1
 * 
 * A collection of objects that are inserted and removed according to the last-in
 * first-out principle. Although similar in purpose, this interface differs from
 * java.util.Stack
 * @author Julia Motzko
 * @version 
 * @param <E> 
 */
public interface StackInterface <E>{
    
    /**
     * Returns the number of elements in the stack.
     * @return number of elements in the stack
     */
    int size();
    
    /**
     * Tests whether the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();
    
    /**
     * Insert an element at the top of the stack.
     * @param e the elements to be inserted
     */
    void push(E e); //need to add stuff to this
    sadf
    
    /**
     * Returns, but does not remove, the element at the top of the stack. 
     * @return top element of the stack (or null if empty)
     */
    E top();
    
    /**
     * Removes and returns the top element from the stack.
     * @return element removed (or null if empty)
     */
    E push();
    
}
