package ed.pilha.pilhaSimples;

public abstract class ArrayStack implements Stackable{

    private int pointerTop;
    private Object [] data;

    public ArrayStack (){
        this(10);
    }

    public ArrayStack (int length){
        data = new Object[length];
        pointerTop = -1;
    }

    //principais

    @Override
    public void push(Object data){
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            pointerTop++;
            this.data[pointerTop] = data;
        }
    }

    @Override
    public Object pop(){
        Object temp = null;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            temp = data[pointerTop];
            pointerTop--;
        }
        return temp;
    }

    @Override
    public Object peek(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            return data[pointerTop];
        }
        return null;

    }


    //auxiliares

    @Override
    public boolean isEmpty(){
        return (pointerTop == data.length - 1);
    }

    @Override
    public boolean isFull(){
        return (pointerTop == -1);
    }

    @Override
    public String print(){
        String resultado = "[";
        for(int i = pointerTop; i >= 0; i++){
            if (i==0)
                resultado += data[i];
            else {
                resultado += data[i] + ",";
            }
        }
        return resultado + "]";
    }






}
