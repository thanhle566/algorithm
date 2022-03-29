package linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(5);
        list.append(6);
        list.append(7);
        list.printLinkedList();
        list.addToPosition(99, 3);
        list.printLinkedList();
    }
}
