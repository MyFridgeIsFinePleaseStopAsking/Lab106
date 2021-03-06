/**
 * Transcribed from the textbook "Data Structures and Algorithms in
 * Java" by Michael T. Goodrich; Robert Tamassia; Michael H. Goldwasser, code fragment6.10
 * Implementation of the queue ADT using a fixed-length array
 * @author jmmot
 */
public class ArrayQueue<E> implements Queue<E> {
    //instance variables
    public static final int CAPACITY = 1000;
    private E[] data; //generic array used for storage
    private int f = 0; //index of the front element
    private int sz = f; //current number of elements
    
    //constructors
    public ArrayQueue(){
        this(CAPACITY); //construcs queue with default capacity
    }
    public ArrayQueue(int capacity){ //constructs queue with given capacity
        data = (E[]) new Object[capacity]; //safe cast; compiler may give warning
    }
    
    //methods
    /**Returns the number of elements in the queue.*/
    public int size(){
        return sz;
    }
    /**tests whether the queue is empty.*/
    public boolean isEmpty(){
        return (sz == 0);
    }
    /**inserts an element at the rear of the queue*/
    public void enqueue(E e) throws IllegalStateException{
        if(sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + sz) % data.length; //use modular arithmetic
        data[avail] = e;
        sz++;
    }
    /**returns, but does not remove, the first element of the queue(null if empty).*/
    public E first(){
        if(isEmpty()) return null;
        return data[f];
    }
    /**removes and returns the first element of the queue(null if empty).*/
    public E dequeue(){
        if(isEmpty()) return null;
        E answer = data[f]; //deference to help garage collection
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }
    
}
