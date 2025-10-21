package ed.I_Unidade.exercicios.lista;

public interface Listable{

    //C
    void insert(Object data, int logicalIndex);
    void append(Object data);

    //R
    Object select(int logicalIndex);
    Object[] selectAll();
    //U
    Object update(Object data, int logicalIndex);

    //D
    Object delete(int logicalIndex);
    void clear();

    //Auxiliares:
    boolean isEmpty();
    boolean isFull();
    String print();
}