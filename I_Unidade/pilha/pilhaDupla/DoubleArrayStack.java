package ed.I_Unidade.pilha.pilhaDupla;

public class DoubleArrayStack implements DoubleStackable{
    private int pointerTop1;
    private int pointerTop2;
    private Object[] data;

    public DoubleArrayStack(){
        this(10);
    }

    public DoubleArrayStack(int length){
        pointerTop1 = -1;
        pointerTop2 = data.length;
        data = new Object[length];
    }

    //principais p1

    @Override
    public void push1(Object data) {
        if (isFull1()){
            System.out.println("Stack is full");
        }
        else{
            pointerTop1++;
            this.data[pointerTop1] = data;
        }
    }

    @Override
    public Object pop1() {
        Object temp = null;
        if(isEmpty1()){
            System.out.println("Stack is empty");
        }
        else{
            temp = data[pointerTop1];
            pointerTop1--;
        }
        return temp;
    }

    @Override
    public Object peek1() {
        if(isEmpty1()) {
            System.out.println("Stack is empty");
        } else {
            return data[pointerTop1];
        }
        return null;
    }

    //principais p2

    @Override
    public void push2(Object data) {
        if(isFull2()){
            System.out.println("Stack is full");
        }
        else{
            pointerTop2--;
            this.data[pointerTop2] = data;
        }
    }

    @Override
    public Object pop2() {
        Object temp = null;

        if(isEmpty2()){
            System.out.println("Stack is empty");
        }
        else{
            temp = data[pointerTop2];
            pointerTop2++;
        }
        return temp;
    }

    @Override
    public Object peek2() {
        if (isEmpty2()) {
            System.out.println("Stack is empty");
        }
        else{
            return data[pointerTop2];
        }
        return null;
    }

    //auxiliares p1

    @Override
    public boolean isFull1() {
        return (pointerTop1 + 1 == pointerTop2);
    }

    @Override
    public boolean isEmpty1() {
        return (pointerTop1 == -1);
    }

    @Override
    public String print1() {
        String resultado = "[";
        for(int i = pointerTop1; i >= 0; i++){
            if (i==0)
                resultado += data[i];
            else {
                resultado += data[i] + ",";
            }
        }
        return resultado + "]";
    }

    //auxiliares p2


    @Override
    public boolean isFull2() {
        return (pointerTop2 - 1 == pointerTop1);
    }

    @Override
    public boolean isEmpty2() {
        return (pointerTop2 == data.length);
    }

    @Override
    public String print2() {
        String resultado = "[";
        for(int i = pointerTop2; i < data.length; i--){
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