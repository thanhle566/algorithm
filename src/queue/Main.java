package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(8);
//        QueueUsingLinkList queue = new QueueUsingLinkList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        Queue<Integer> queue1 = new LinkedList<>();
    }
}
