package ed.I_Unidade.heap;

import ed.I_Unidade.fila.filaCircular.Queueable;

public class MaxBinaryTreeHeap implements Queueable{

    private int tail;
    private Object[] data;

    public MaxBinaryTreeHeap(){
        this(15);
    }

    public MaxBinaryTreeHeap (int length){
        tail = -1;
        data = new Object[length];
    }

    private int parent (int son){
        return (son - 1) / 2;

    }

    private int leftSon (int parent){
        return (parent * 2 + 1);
    }

    private int rightSon (int parent){
        return (parent * 2 + 2);
    }


    @Override
    public void enqueue(Object data) {
        if(isFull()){
            System.err.println("Heap is full!");
        }else{
            tail++;
            this.data[tail] = data;
            heapifyUp(tail);
        }
    }

    @Override
    public Object dequeue() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Heap is empty!");
        }
        else {
            temp = data[0];
            data[0] = data[tail];
            tail--;
            heapifyDown(0);

        }
        return temp;
    }

    private void swap (int index1, int index2){
        Object temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private void heapifyUp(int index){
        int temp = parent(index);
        while (index >= 0 && (Integer) data[index] > (Integer) data[temp]){
            swap (index, temp);
            index = temp;
            temp = parent(index);
        }
    }

    private void heapifyDown(int index){

        int leftSon = leftSon(index);
        int rightSon = rightSon(index);

        while((leftSon <= tail || rightSon <=tail) &&
                ((Integer) data[index] < (Integer) data[leftSon] ||
                        (Integer) data[index] < (Integer) data[rightSon])){

            if (rightSon <= tail && (Integer) data[rightSon] > (Integer) data[leftSon]) {
                swap(rightSon, index);
                index = rightSon;
            } else {
                swap(leftSon, index);
                index = leftSon;
            }

            leftSon = leftSon(index);
            rightSon = rightSon(index);
        }

        //Implementação por cláudio
        /*
        boolean ajustado = false;
        while (!ajustado) {
            int left = leftSon(index);
            int right = rightSon(index);
            int maior = index;
            if((Integer) data[left] > (Integer) data[maior] && left <= tail) {
                maior = left;
            }
            if ((Integer) data[left] > (Integer) data[maior] && right <= tail) {
                maior = right;
            }
            if (maior != index) {
                swap(maior, index);
                index = maior;
            }
            else {
                ajustado = true;
            }
        }
        */
    }


    @Override
    public Object front() {
        Object temp = null;
        if(isEmpty()){
            System.err.println("Heap is empty!");
        }else{
            temp = data[0];
        }
        return temp;
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


        return null;
    }
}