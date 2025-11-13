package StacksAndQueues.Stacks.Queues;

public class myQueue {

    protected int[] arr;
    int end = 0;
    static final int ARRAY_SIZE = 10;

    myQueue() {
        this(ARRAY_SIZE);
    }

    myQueue(int size) {
        arr = new int[size];
    }

    public int push(int val){
        if (isFull()) {
            throw new IllegalStateException("Queue is Overflow!");
        }
        return arr[end++] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty!");
        }
        int remove = arr[0];
        for (int i = 0; i < end-1; i++) {
            arr[i] = arr[i + 1];
        }
        end--;
        return remove;
    }

    public int first() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty");
        return arr[0];
    }

    public int last() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty");
        return arr[end-1];
    }

    public boolean isFull() {
        return end == arr.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
    public void display(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty!");
        }
        for(int i=0; i<end ; i++){
            System.out.print(arr[i]+"-> ");
        }
    System.out.print("END");
    }
}

