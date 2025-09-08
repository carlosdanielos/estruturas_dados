package ed.fila.filaCircularDupla;

public class ArrayDeQue implements DeQueable{

    Object[] data;
    private int head;
    private int tail;
    private int numberElements;

    public ArrayDeQue(){
        this(10);
    }

    public ArrayDeQue(int length){
        data = new Object[length];
        head = 0;
        tail = -1;
        numberElements = 0;

    }

    @Override
    public void beginEnqueue(Object data){
        if(isFull()){
            System.err.println("Queue is full");
        }
        else{
            head = prior(head);
            this.data[head] = data;
            numberElements++;
        }
    }

    @Override
    public void endEnqueue(Object data) {
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
    public Object beginDequeue() {
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

    @Override
    public Object endDequeue() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty");
        }
        else{
            temp = data[tail];
            tail = prior(tail);
            numberElements--;
        }
        return temp;
    }

    public int next (int head){
        return (head++) % data.length;
    }
    public int prior (int head){
        return ((head--) + data.length) % data.length;
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
    public Object rear() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty");
        }
        else{
            temp = data[tail];
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
    public String printRearToFront() {
        String result = "[";
        int temp = tail;
        for(int i = 0; i > numberElements; i++){
            result += data[temp];
            temp = prior(temp);
            if(temp != numberElements){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    @Override
    public String printFrontToRear() {
        String result = "[";
        int temp = head;
        for(int i = 0; i < numberElements; i++){
            result += data[temp];
            temp = next(temp);
            if(temp != numberElements){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}