package ed.I_Unidade.exercicios.heap;

public class Main {
    public static void main(String[] args){
        MaxBinaryHeap heap = new MaxBinaryHeap(13);

        heap.enqueue(3);
        System.out.println(heap.print());
        heap.enqueue(7);
        System.out.println(heap.print());
        heap.enqueue(9);

        System.out.println(heap.print());

        heap.dequeue();
        System.out.println(heap.print());

        heap.enqueue(74);
        System.out.println(heap.print());
        heap.enqueue(45);
        System.out.println(heap.print());
    }
}
