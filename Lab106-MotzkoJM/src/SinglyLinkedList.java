
/**
 * This class is a nested node within a SinglyLinkedList
 *
 * @Transcribing author Julia Motzko
 * @version Transcribed from the textbook "Data Structures and Algorithms in
 * Java" by Michael T. Goodrich; Robert Tamassia; Michael H. Goldwasser, chapter
 * 3.2, fragment 3.14, 3.15
 */
public class SinglyLinkedList<E> {

    //nested node class
    private static class Node<E> {

        private E element; //reference to the element stored at this node
        private Node<E> next; //reference to the subsequent node in the list

        /**
         * constructor method for singly linked list class
         *
         * @param e
         * @param n
         */
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        /**
         * returns element
         *
         * @return
         */
        public E getElement() {
            return element;
        }

        /**
         * returns next
         *
         * @return
         */
        public Node<E> getNext() {
            return next;
        }

        /**
         * set next
         *
         * @param n
         */
        public void setNext(Node<E> n) {
            next = n;
        }
    }
    //instance variables of the SinglyLinkedList
    private Node<E> head = null; //head node of the list(or null if empty)
    private Node<E> tail = null; //last node of the list(or null if empty)
    private int size = 0; //number of nodes in the list

    /**
     * out of nested
     */
    public SinglyLinkedList() {
    } //constructs an initially empty list
    //access methods

    /**
     * returns size
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * returns isempty
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * first method for linked list
     *
     * @return
     */
    public E first() { //returns (but does not remove) the first element
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    /**
     * last method for linked list
     *
     * @return
     */
    public E last() { //returns (but does not remove) the last element
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    /**
     * addfirst method for list
     *
     * @param e
     */
    //update methods
    public void addFirst(E e) { //adds element e to the front of the list
        head = new Node<>(e, head); //create and link a new node
        if (size == 0) {
            tail = head; //special case: new node becomes tail also
        }
        size++;

    }

    /**
     * add last for list
     *
     * @param e
     */
    public void addLast(E e) { //adds element e to the front of the list
        Node<E> newest = new Node<>(e, null); //node will eventually be the tail
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest); //new node after existing tail
        }
        tail = newest; //new node becomes the tail
        size++;

    }

    /**
     * removes first from list
     *
     * @return
     */
    public E removeFirst() { //removes and returns the first element
        if (isEmpty()) {
            return null; //nothing to remove
        }
        E answer = head.getElement();
        head = head.getNext(); //will become null if list had only one node
        size--;
        if (size == 0) {
            tail = null; //special case as list is not empty
        }
        return answer;

    }
}
