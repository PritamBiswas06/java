package Stack_Queue;

public class StackCustomImplementation {
    int ptr=-1;
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public StackCustomImplementation() {
        this(DEFAULT_SIZE);
    }

    public StackCustomImplementation(int size) {
        this.data=new int[size];
    }


    public boolean push(int item){
        if (isFull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Stack is empty");
        }
        int remove=data[ptr];
        ptr--;
        return  remove;
    }

    public int peek(){
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

}