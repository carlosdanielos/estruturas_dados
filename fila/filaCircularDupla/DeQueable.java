package ed.fila.filaCircularDupla;

public interface DeQueable {
    void beginEnqueue(Object data);
    void endEnqueue(Object data);

    Object beginDequeue();
    Object endDequeue();

    Object front();
    Object rear();


    boolean isEmpty();
    boolean isFull();

    String printRearToFront();
    String printFrontToRear();
}