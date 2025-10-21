package ed.I_Unidade.exercicios.heap;

public interface Heapable {

    //C
    void enqueue(Object data);
    //R
    Object peek();
    //D
    Object dequeue();


    boolean isEmpty();
    boolean isFull();
    String print();



}