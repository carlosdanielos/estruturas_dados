package ed.I_Unidade.pilha.pilhaInvertida;

import ed.I_Unidade.pilha.pilhaSimples.Stackable;

public class ArrayStackInverted implements Stackable{
    private Object[] data;
    private int pointerTop;

    public ArrayStackInverted (){
        this(10);
    }
    public ArrayStackInverted(int length){
        pointerTop = data.length;
        data = new Object[length];
    }

    //principais

    @Override
    public void push(Object data) {
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            pointerTop--;
            this.data[pointerTop] = data;
        }
    }

    @Override
    public Object pop() {
        Object temp = null;

        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            temp = data[pointerTop];
            pointerTop++;
        }
        return temp;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            return data[pointerTop];
        }
        return null;
    }

    //auxiliares

    @Override
    public boolean isEmpty(){
        return(pointerTop == data.length);
    }

    @Override
    public boolean isFull(){
        return(pointerTop == -1);
    }

    @Override
    public String print(){
        String resultado = "[";
        for(int i = pointerTop; i < data.length; i--){
            if(i== data.length){
                resultado += data[i];
            }
            else{
                resultado += data[i] + ",";
            }
        }
        return resultado + "]";
    }


}
