package ed.heap;

public interface Heapable{

    void enqueue(Object data);
    Object dequeue();
    Object front();


    boolean isEmpty();
    boolean isFull();
    String print();
}