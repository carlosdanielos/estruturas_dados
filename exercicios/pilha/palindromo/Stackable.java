package ed.exercicios.pilha.palindromo;

public interface Stackable {

    char peek();
    void write(char c);
    char erase();

    boolean isEmpty();
    boolean isFull();
    String print();

}
