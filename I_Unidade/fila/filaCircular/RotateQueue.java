package ed.I_Unidade.fila.filaCircular;

public class RotateQueue implements Queueable{
    private Object[] data;
    private int head;
    private int tail;
    private int numberElements;

    public RotateQueue(){
        this(10);
    }

    public RotateQueue(int length){
        data = new Object[length];
        head = 0;
        tail = -1;
        numberElements = 0;
    }

    @Override
    public void enqueue(Object data) {

        if(isFull()){
            System.err.println("Queue is full");
        }
        else{
            tail = next(tail);
            this.data[tail] = data;
            numberElements++;
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
            head = next(head);
            numberElements--;
        }
        return temp;
    }

    public int next (int head){
        return (head + 1) % data.length;
    }

    @Override
    public Object front(){
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
        return (numberElements == 0);
    }

    @Override
    public boolean isFull() {

        return (numberElements == data.length);
    }

    @Override
    public String print(){
        String result = "[";
        int temp = head;
        for(int i = 0; i < numberElements; i++){
            result += data[temp];
            temp = next(temp);
            if(temp != numberElements - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}