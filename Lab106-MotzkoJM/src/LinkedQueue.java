/**
 * Transcribed from the textbook "Data Structures and Algorithms in
 * Java" by Michael T. Goodrich; Robert Tamassia; Michael H. Goldwasser, code fragment 6.11
 * Realization of a FIFO queue as an adaption of a SinglyLinkedList.
 * @author jmmot
 */
public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>(); //an empty list
    public LinkedQueue(){} //new queue relies on the initally empty list
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enqueue(E element){
        list.addLast(element);
    }
    public E first(){
        return list.first();
    }
    public E dequeue(){
        return list.removeFirst();
    }
    
}
