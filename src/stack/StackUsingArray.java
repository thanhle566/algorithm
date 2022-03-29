package stack;

public class StackUsingArray {
    private int top = -1;
    private int MAX_LENGTH = 5;
    private int[] arr = new int[MAX_LENGTH];

    boolean isEmpty() {
        return top < 0;
    }

    void push(int a) {
        if (top >= MAX_LENGTH - 1) {
            System.out.println("Stack is full, can not push ");
        } else {
            arr[++top] = a; // top = top + 1 then arr[top] = a;
            System.out.println(a + " is pushed to stack");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int popNumber = arr[top--]; // popNumber = arr[top] then top = top - 1
            System.out.println(popNumber + " is popped from stack.");
            return popNumber;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return arr[top];
        }
    }

    void printStack() {
        System.out.println("----Print Stack----");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
