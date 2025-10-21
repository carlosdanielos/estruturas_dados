package ed.I_Unidade.lista;

public interface Listable{

    //métodos auxiliares
    boolean isEmpty();
    boolean isFull();
    String print();


    //métodos principais

        //C
    void insert(Object data, int logicalIndex);
    void append(Object data);

        //R
    Object select(int logicIndex);
    Object[] selectAll();

        //U
    void update(Object data, int logicalIndex);

        //D
    Object delete(int logicalIndex);
    void clear();
}