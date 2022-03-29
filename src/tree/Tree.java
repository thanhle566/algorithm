package tree;

import java.util.LinkedList;
import java.util.Queue;

class Tree {
    private Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    Tree(int data) {
        this.root = new Node(data);
    }

    //traversal

    void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data + " ");

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null)
                queue.add(node.right);
        }
    }

    void inOder(Node root) {
        if (root == null) return;
        inOder(root.left);
        System.out.print(root.data + " ");
        inOder(root.right);
    }

    void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }


    int getSize(Node head) {
        if (head == null) return 0;
        return 1 + getSize(head.left) + getSize(head.right);
    }

    int getHeight(Node head) {
        if (head == null) return 0;
        return 1 + Math.max(getHeight(head.left), getHeight(head.right));
    }

    boolean checkIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 != null && root2 != null)
            return root1.data == root2.data && checkIdentical(root1.left, root2.left) && checkIdentical(root1.right, root2.right);
        else return false;
    }

}
