package StacksAndQueues.Stacks.Queues;

public class main extends myQueue {
    public static void main(String[] args) {
        // myQueue q = new myQueue();
        // q.push(1);
        // q.push(2);
        // q.push(3);
        // q.push(4);
        // q.push(5);
        // q.display();
        // System.out.println(q.pop());
  
        // System.out.println("First element " + q.first() + ", last element: " + q.last());
        // System.out.println("Queue is Empty: " + q.isEmpty());
        // System.out.println("Queue is Full: " + q.isFull());

        CircularQueue cq = new DynamicQueue();
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.display();


        cq.remove();
        cq.insert(6);
        cq.display();
        

        cq.remove();
        cq.insert(7);
        cq.display();
        

        cq.remove();
        cq.insert(8);
        cq.display();
        

        cq.remove();
        cq.insert(9);
        cq.display();
        
    }
}
