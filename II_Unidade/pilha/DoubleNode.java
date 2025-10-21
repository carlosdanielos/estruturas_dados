package ed.II_Unidade.pilha;

public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;


    public DoubleNode<T> getNext() { return next; }
    public T getData() { return data; }
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    public void setData(T data) { this.data = data; }
    public void setNext(DoubleNode<T> next) { this.next = next; }
    public void setPrior(DoubleNode<T> previous) { this.previous = previous; }

}
