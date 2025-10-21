package ed.II_Unidade.pilha;

public interface Stackable<T> {

    //métodos principais
    T peek();
    void push(T data);
    T pop();
    void update(T newData);

    //métodos auxiliares
    boolean isFull();
    boolean isEmpty();
    String print();
}