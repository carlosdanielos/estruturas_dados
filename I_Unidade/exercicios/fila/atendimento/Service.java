package ed.I_Unidade.exercicios.fila.atendimento;

public class Service implements Queueable{

    private int head;
    private int tail;
    private int numberElements;
    private Object[] person;


    //Construtores
    public Service(){
        this(10);
    }

    public Service(int length){
        head = 0;
        tail = -1;
        numberElements = 0;
        person = new Object[length];
    }

    //Métodos auxiliares
    @Override
    public String print() {
        String result = "[";
        int temp = head;
        for(int i = 0; i < numberElements; i++){
            if(i == numberElements - 1){
                result += person[temp];
                temp = next(temp);
            } else{
                result += person[temp] + ", ";
                temp = next(temp);
            }
        }
        result += "]";
        return result;
    }

    @Override
    public boolean isEmpty() {
        return numberElements == 0;
    }

    @Override
    public boolean isFull() {
        return numberElements == person.length;
    }

    private int next(int head){
        return (head + 1) % person.length;
    }

    private int prior(int head){
        return ((head - 1) + person.length) % person.length;
    }


    //Métodos principais
    @Override
    public void addCostumer(Object person) {
        if(isFull()){
            System.err.println("Queue is full!");
        }
        else{
            tail = next(tail);
            this.person[tail] = person;
            numberElements++;
        }
    }

    @Override
    public Object serveCostumer() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty!");
        }
        else{
            temp = person[head];
            head = next(head);
            numberElements--;
        }

        return temp;
    }

    @Override
    public Object front() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Queue is empty!");
        }
        else{
            temp = person[head];
        }
        return temp;
    }
}