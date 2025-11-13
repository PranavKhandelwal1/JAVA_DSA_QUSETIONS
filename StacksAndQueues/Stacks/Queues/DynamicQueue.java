package StacksAndQueues.Stacks.Queues;

public class DynamicQueue extends CircularQueue {
    int[] arr;
    static final int ARRAY_SIZE = 10;
    int end = 0;

    DynamicQueue() {
        this(ARRAY_SIZE);
    }

    DynamicQueue(int size) {
        arr = new int[size];
    }
    @Override
    public int insert(int val) {
        if (this.isFull()) {
            int[] temp = new int[arr.length * 2];
            for(int i = 0; i < end; i++){
                temp[i] = arr[(start + i) & arr.length];
            }
            start = 0;
            end = arr.length;
            arr = temp;
        }
        return super.insert(val);
    }

}
