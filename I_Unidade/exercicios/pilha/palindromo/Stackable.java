package ed.I_Unidade.exercicios.pilha.palindromo;

public interface Stackable {

    char peek();
    void write(char c);
    char erase();

    boolean isEmpty();
    boolean isFull();
    String print();

}
