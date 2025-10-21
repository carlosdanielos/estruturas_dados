package ed.I_Unidade.exercicios.pilha.palindromo;


public class Palindromo implements Stackable {

    private int top;
    private char[] data;

    //Construtores
    public Palindromo(){
        this(10);
    }

    public Palindromo(int length){
        data = new char[length];
        top = -1;
    }


    //Métodos auxiliares
    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public String print(){
        String result = null;
        if(isEmpty()){
            System.err.println("Stack is empty!");
        }
        else{
            result += "[";
            for(int i = top; i >= 0; i--){
                result += data[i];
                if(i == 1){
                    result += data[i];
                }
                else{
                    result += data[i] + ", ";
                }
            }
            result += "]";
        }
        return result;
    }


    //Métodos principais
    public void write(char data){
        if(isFull()){
            System.err.println("Stack is full!");
        }
        else{
            top++;
            this.data[top] = data;
        }
    }

    public char erase(){
        Character temp = null;
        if(isEmpty()){
            System.err.println("Stack is empty!");
        }
        else{
            temp = data[top];
            top--;
        }
        return temp;
    }

    public char peek(){
        Character temp = null;
        if(isEmpty()){
            System.err.println("Stack is empty!");
        }
        else{
            temp = data[top];
        }
        return temp;
    }

    private boolean verification(String word){

        Palindromo palindromo = new Palindromo(word.length());

        boolean temp = true;
        for(int i = 0; i < word.length(); i++){
            palindromo.write(word.charAt(i));
        }

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != palindromo.erase()){
                temp = false;
            }
        }

        return temp;
    }

}