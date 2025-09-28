package ed.lista;

public class ArrayList implements Listable{

    private Object[] data;
    private int head;
    private int tail;
    private int numberElements;

    public ArrayList(){
        this(10);
    }
    public ArrayList(int length){
        data = new Object[length];
        head = 0;
        tail = -1;
        numberElements = 0;
    }

    @Override
    public boolean isEmpty(){
        return (numberElements == 0);
    }

    @Override
    public boolean isFull(){
        return(numberElements == data.length);
    }

    @Override
    public String print(){
        String result = "[";
        int temp = head;
        for(int i = 0; i < numberElements; i++){
            result += data[temp];
            temp = next(temp);
            if(i != numberElements - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public int prior(int index){
        return (index-1+data.length)%data.length;
    }
    public int next (int index){
        return (index++) % data.length;
    }
    private int map (int index){
        return (head + index) % data.length;
    }


    /*@Override
    public void insert(Object data, int logicalIndex){
        if(isFull()){
            System.err.println("List is full!");
        }
        if(logicalIndex < 0 || logicalIndex > numberElements){
            System.err.println("invalid index!");
        }
        int physicalIndex = map(logicalIndex);

        int aux = tail;

        for(int i = 0; i < (numberElements - logicalIndex); i++){
            this.data[next(aux)] = this.data[aux];
            aux = prior(aux);
        }
        this.data[aux] = data;
        numberElements++;
        tail = next(tail);
    }*/


    public void insert(Object data, int logicalIndex){
        if(isFull()){
            System.err.println("List is full!");
        }
        if(logicalIndex < 0 || logicalIndex > numberElements){
            System.err.println("invalid index!");
        }
        int physicalIndex = map(logicalIndex);

        int aux = head;

        for(int i = 0; i < logicalIndex; i++){
            this.data[prior(aux)] = this.data[aux];
            aux = next(aux);
        }
        this.data[aux] = data;
        numberElements++;
        head = prior(head);
    }


    @Override
    public void append(Object data){
        if(isFull()){
            System.err.println("List is full");
        }
        else{
            tail = next(tail);
            this.data[tail] = data;
            numberElements++;
        }
    }

    @Override
    public Object select(int logicalIndex){

        Object temp = null;
        if(isEmpty()){
            System.err.println("List is empty!");
        }else if(logicalIndex < 0 || logicalIndex > numberElements - 1){
            System.err.println("Invelid Index");
        } else{
            int physicalIndex = map(logicalIndex);
            temp = data[physicalIndex];
        }
        return temp;
    }

    @Override
    public Object[] selectAll(){

        Object[] result = new Object[numberElements];

        int temp = head;
        for(int i = 0; i < numberElements; i++){
            result[i] = data[temp];
            temp = next(temp);
        }
        return result;
    }


    @Override
    public void update(Object data, int logicalIndex){
        Object temp = null;
        if(isEmpty()){
            System.err.println("List is empty!");
        }else if(logicalIndex < 0 || logicalIndex > numberElements - 1){
            System.err.println("Invalid Index!");
        } else{
            int physicalIndex = map(logicalIndex);
            this.data[physicalIndex] = data;
        }
    }


    /*@Override
    public Object delete(int logicalIndex){
        if(isEmpty()){
            System.err.println("List is empty!");
        }
        if(logicalIndex < 0 || logicalIndex >= numberElements){
            System.err.println("Invalid Index!");
        }

        int  physicalIndex = map(logicalIndex);
        int aux = physicalIndex;
        Object temp = this.data[physicalIndex];

        for(int i = 0; i < (numberElements-logicalIndex-1); i++){
            this.data[aux] = this.data[next(aux)];
            aux = next(aux);
        }
        numberElements--;
        tail = prior(tail);
        return temp;
    }*/

    @Override
    public Object delete(int logicalIndex){
        if(isEmpty()){
            System.err.println("List is empty!");
        }
        if(logicalIndex < 0 || logicalIndex >= numberElements){
            System.err.println("Invalid Index!");
        }

        int  physicalIndex = map(logicalIndex);
        int aux = physicalIndex;
        Object temp = this.data[physicalIndex];

        for(int i = 0; i < logicalIndex; i++){
            this.data[aux] = this.data[prior(aux)];
            aux = prior(aux);
        }
        numberElements--;
        head = next(head);
        return temp;
    }



    @Override
    public void clear(){
        head = 0;
        tail = -1;
        numberElements = 0;

    }
}