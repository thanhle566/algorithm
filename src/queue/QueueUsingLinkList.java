package queue;

public class QueueUsingLinkList {
    Node front, rear;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    boolean isEmpty() {
        return this.front == null;
    }

    void enqueue(int data) {
        Node node = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    int dequeue() {
        if (this.front == null) {
            return Integer.MIN_VALUE;
        }
        int data = this.front.value;
        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
        return data;
    }


    void printQueue() {
        Node i = this.front;
        while (i != null) {
            System.out.print(i.value + " ");
            i = i.next;
        }
    }
}
