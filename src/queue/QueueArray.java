package queue;

public class QueueArray {
    int front, rear, size;
    int capacity;
    int[] arr;

    QueueArray(int capacity) {
        this.capacity = capacity;
        rear = front = size = 0;
        arr = new int[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        if (isFull()) {
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    void printQueue() {
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

}
