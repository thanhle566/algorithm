package stack;

public class StackUsingLinkList {
    Node root;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    boolean isEmpty() {
        return root == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        }else{
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " is pushed.");
    }

    int pop(){
        if(root == null){
            return -1;
        }else{
            int data = root.data;
            root = root.next;
            System.out.println(data + " is popped.");
            return data;
        }

    }

    int peek(){
        if(root == null){
            return -1;
        }else{
            return root.data;
        }
    }

    void printStack(){
        System.out.println("----Print Stack----");
        Node i = root;
        while(i != null){
            System.out.print(i.data + " ");
            i = i.next;
        }
    }


}
