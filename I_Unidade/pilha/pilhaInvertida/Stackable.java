package ed.I_Unidade.pilha.pilhaInvertida;

public interface Stackable {
        //métodos principais

        Object peek();
        void push(Object data);
        Object pop();

        //métodos auxiliares
        boolean isFull();
        boolean isEmpty();
        String print();
}
