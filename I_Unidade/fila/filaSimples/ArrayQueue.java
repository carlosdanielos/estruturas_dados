package ed.I_Unidade.fila.filaSimples;

public class ArrayQueue implements Queueable{
    private Object[] data;
    private int head;
    private int tail;

    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int length){
        data = new Object[length];
        head = 0;
        tail = -1;
    }

    @Override
    public void enqueue(Object data) {

        if(isFull()){
            System.err.println("Queue is full");
        }
        else{
            tail++;
            this.data[tail] = data;
        }
    }

    @Override
    public Object dequeue() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty");
        }
        else{
            temp = data[head];
            head++;
        }
        return temp;
    }

    @Override
    public Object front() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty");
        }
        else{
            temp = data[head];
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return (head - 1 == tail);
    }

    @Override
    public boolean isFull() {

        return (tail == data.length - 1);
    }

    @Override
    public String print() {
        String result = "[";
        for(int i = head; i <= tail; i++){
            result += data[i];
            if (i != tail){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}