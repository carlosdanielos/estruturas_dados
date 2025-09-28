package ed.exercicios.fila.atendimento;

public interface Queueable {

    //Métodos auxiliares
    String print();
    boolean isEmpty();
    boolean isFull();

    //Métodos principais
    void addCostumer(Object person);
    Object serveCostumer();
    Object front();
}