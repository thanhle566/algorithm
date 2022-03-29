package linked_list;

class SinglyLinkedList {
    private Node root;

    SinglyLinkedList(int data) {
        this.root = new Node(data);
    }

    SinglyLinkedList(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    // reverse using iterative
    Node reverseList() {
        Node head = root;
        Node nextnode = null, prev = null;
        while (head != null) {
            nextnode = head.getNext();     // Take the head next as nextnode
            head.setNext(prev);          // Make the head next as tmp node
            prev = head;               // Update tmp node to store the head node
            head = nextnode;          // Make head next move to the next node
        }
        return prev;
    }

    //reverse using recursive
    Node reverseRecursive(Node head) {
        if (head == null) {
            return head;
        }

        // last node or only one node
        if (head.getNext() == null) {
            return head;
        }

        Node newHeadNode = reverseRecursive(head.getNext());

        // change references for middle chain
        head.getNext().setNext(head);
        head.setNext(null);

        // send back new head node in every recursion
        return newHeadNode;
    }

    void deleteByValue(int value) {
        if (root != null) {
            while (root.getData() == value) {
                root = root.getNext();
            }
            Node ite = root;
            Node prev = ite;
            while (ite != null) {
                if (ite.getData() == value) {
                    prev.setNext(ite.getNext());
                } else {
                    prev = ite;
                }
                ite = ite.getNext();
            }
        }
    }

    void deleteByKey(int key) {
        if (root != null) {
            Node ite = root;
            Node prev = ite;
            if (key == 0) {
                root = root.getNext();
            }
            while (ite != null) {
                if (key == 0) {
                    prev.setNext(ite.getNext());
                }
                prev = ite;
                key--;
                ite = ite.getNext();

            }

        }
    }

    void addToPosition(int value, int position) {
        Node ite = root;
        Node newNode = new Node(value);
        while (ite.getNext() != null) {
            if (position-- == 1) {
                newNode.setNext(ite.getNext());
                ite.setNext(newNode);
                break;
            }
            ite = ite.getNext();
        }
        if(position > 0){
            ite.setNext(newNode);
        }
    }

    void append(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node ite = root;
            while (ite.getNext() != null) {
                ite = ite.getNext();
            }
            ite.setNext(newNode);
        }
    }

    void appendFirst(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            root = newNode;
            root.setNext(temp);
        }
    }

    void printtingReverseWithoutReverseList(Node head) {
        if (head == null) return;
        printtingReverseWithoutReverseList(head.getNext());
        System.out.print(head.getData() + " ");
    }

    void printLinkedList() {
        System.out.println();
        System.out.println("-----print list------");
        Node i = root;
        while (i != null) {
            System.out.print(i.getData() + " ");
            i = i.getNext();
        }
    }
}
