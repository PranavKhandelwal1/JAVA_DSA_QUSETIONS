package StacksAndQueues.Stacks.Queues;

public class CircularQueue {
    protected int[] arr;
    int size = 0;
    int start = 0;
    int end = 0;
    static final int ARRAY_SIZE = 10;

    CircularQueue() {
        this(ARRAY_SIZE);
    }

    CircularQueue(int size) {
        arr = new int[size];
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int insert(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        arr[end] = item;
        end = (end + 1) % arr.length;
        size++;
        return item;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        int removed = arr[start];
        start = (start + 1) % arr.length;
        size--;
        return removed;
    }

    public int start() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        return arr[start];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = start;
        do {
            System.out.print(arr[i] + "->");
            i++;
            i = i % arr.length;
        } while (i != end);
        System.out.println("END");
    }
}
