
public class ArrayStack<E> implements StackInterface<E> {
    public static final int capacity = 1000; //defailt array capacity
    private E[] data; //genderic array used for storage
    private int t = -1; //index of the top element in stack
    
    public ArrayStack(){ this(capacity); } //constructs stack with default capacity
    
    public ArrayStack(int Capacity){ //constructs stack with given capacity
        data = (E[]) new Object[Capacity]; //safe cast; compiler may give warning
    }
    
    public int size(){
        return (t + 1);
    }
    
    public boolean isEmpty(){
        return (t == -1);
    }
    
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("Stack is Full");
        data[++t] = e;   //increment before storing new item
    }
       
    
}
