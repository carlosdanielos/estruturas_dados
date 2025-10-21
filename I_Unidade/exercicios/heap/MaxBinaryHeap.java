package ed.I_Unidade.exercicios.heap;

public class MaxBinaryHeap implements Heapable{
    private int tail;
    private Object[] data;

    public MaxBinaryHeap (){
        this(10);
    }

    public MaxBinaryHeap(int length){
        this.tail = -1;
        data = new Object[length];
    }

    public long ajustePrioridade(int prioridadeInicial){
        long hour = System.currentTimeMillis();
        long novaPrioridade = 99_999_999_999_999L - hour;
        return prioridadeInicial * 100_000_000_000_000L + novaPrioridade;
    }

    @Override
    public void enqueue(Object data) {
        if(isFull()){
            System.err.println("Heap is empty");
        } else {
            tail++;
            this.data[tail] = data;
            heapifyUp(tail);
        }
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            System.err.println("Heap is empty!");
        }else{
            return data[0];
        }
        return null;
    }

    @Override
    public Object dequeue() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Heap is empty!");
        }else{
            temp = data[0];
            data[0] = data[tail];
            tail--;
            heapifyDown(0);
        }
        return temp;
    }

    private int leftSon(int parent){
        return (parent * 2 + 1);
    }

    private int rigthSon(int parent){
        return (parent * 2 + 2);
    }

    private int parent(int son){
        return (son - 1) / 2;
    }

    private void swap(int index1,int index2){
        Object temp = data[index1];
        data[index1] = data[index2];
        data[index2]= temp;
    }

    private void heapifyUp(int index){
        int temp = parent(index);

        while(index >=0 && (Integer)data[index] > (Integer) data[temp]){
            swap(index, temp);
            index = temp;
            temp = parent(temp);
        }
    }

    private void heapifyDown(int index){
        boolean ajustado = false;
        while(!ajustado){
            int maior = index;
            int left = leftSon(index);
            int rigth = rigthSon(index);

            if((Integer) data[left] > (Integer) data[maior] && left <=tail){
                maior = left;
            }
            if((Integer) data[rigth] > (Integer) data[maior] && rigth <= tail){
                maior = rigth;
            }
            if(maior != index){
                swap(index, maior);
            }
            else{
                ajustado = true;
            }
        }

    }


    @Override
    public boolean isEmpty() {
        return tail == -1;
    }

    @Override
    public boolean isFull() {
        return tail == data.length - 1;
    }

    @Override
    public String print() {
        String result = "[";
        for(int i = 0; i <= tail; i++){
           if(i == tail){
               result += data[i];
           }else{
               result += data[i] + ", ";
           }
        }
        result += "]";
        return result;

    }
}