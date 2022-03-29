package stack;

public class Main {
    public static void main(String[] args) {
//        StackUsingArray stack  = new StackUsingArray();
        StackUsingLinkList stack  = new StackUsingLinkList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("peek: " + stack.peek());
        stack.printStack();
    }
}
