package ed.I_Unidade.exercicios.lista;

import java.util.concurrent.RecursiveTask;

public class ArrayList implements Listable{

    private Object[] data;
    private int head;
    private int tail;
    private int numberElements;


    public ArrayList(){
        this(10);
    }

    public ArrayList (int length){
        this.data = new Object[length];
        this.head = 0;
        this.tail = -1;
        this.numberElements = 0;
    }

    @Override
    public void insert(Object data, int logicalIndex) {
        if(isFull()){
            System.err.println("List is full!");
        }
        else if(logicalIndex < 0 || logicalIndex > numberElements){
            System.err.println("Invalid index!");

        } else{
            int aux = tail;
            int physicalIndex = map(logicalIndex);
            for(int i = numberElements; i > logicalIndex ; i--){
                this.data[next(aux)] = this.data[aux];
                aux = prior(aux);
            }
            this.data[physicalIndex] = data;
            tail++;
            numberElements++;
        }
    }

    @Override
    public void append(Object data) {
        if(isFull()){
            System.err.println("List is full!");
        }
        else{
            tail = next(tail);
            this.data[tail] = data;
            numberElements++;
        }
    }

    @Override
    public Object select(int logicalIndex) {
        Object temp = null;
        if(isEmpty()){
            System.err.println("List is empty!");
        }else{
            temp = this.data[map(logicalIndex)];
        }
        return temp;
    }

    @Override
    public Object[] selectAll() {
        Object temp[] = new Object[numberElements];

        int aux = head;
        for(int i = 0; i < numberElements; i++){
            temp[i] = data[aux];
            aux = next(aux);
        }
        return temp;
    }

    @Override
    public Object update(Object data, int logicalIndex) {
        Object temp = this.data[map(logicalIndex)];

        this.data[map(logicalIndex)] = data;

        return temp;
    }

    @Override
    public Object delete(int logicalIndex) {
        int physicalIndex = map(logicalIndex);
        Object temp = null;

        if(isEmpty()){
            System.err.println("List is empty!");

        } else if (logicalIndex < 0 || logicalIndex > numberElements) {
            System.err.println("Invalid index!");

        } else if (logicalIndex >= numberElements / 2) {
            temp = this.data[physicalIndex];
            int aux = physicalIndex;

            for(int i = numberElements; i > logicalIndex; i--){
                this.data[aux] = this.data[next(aux)];
                aux = next(aux);
            }
            tail = prior(tail);
            numberElements--;
        } else {
            temp = this.data[physicalIndex];
            int aux = physicalIndex;
            for(int i = 0; i < logicalIndex; i++){
                this.data[aux] = this.data[prior(aux)];
                aux = prior(aux);
            }
            head = prior(head);
            numberElements--;
        }

        return temp;
    }

    @Override
    public void clear() {
        head = 0;
        tail = -1;
        numberElements = 0;
    }

    private int next(int index){
        return (index + 1) % data.length;
    }

    private int prior(int index){
        return (index + 1) % data.length;
    }

    private int map(int logicalIndex){
        return (head + logicalIndex) % data.length;
    }

    @Override
    public boolean isEmpty() {
        return numberElements == 0;
    }

    @Override
    public boolean isFull() {
        return numberElements == data.length - 1;
    }

    @Override
    public String print() {
        String result = "";
        if(isEmpty()){
            result+= "List is empty!";
        }else{
            for(int i = 0; i < numberElements; i ++){
                if(i == numberElements - 1){
                    result += i + " - " + data[i];
                }
                else{
                    result += i + " - " + data[i] + "\n";
                }
            }
        }
        return result;
    }
}
