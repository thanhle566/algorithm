package tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.getRoot().left = new Tree.Node(2);
        tree.getRoot().left.left = new Tree.Node(2);
        tree.getRoot().left.left.right = new Tree.Node(2);
        tree.getRoot().right = new Tree.Node(3);
        System.out.println(tree.getHeight(tree.getRoot()));
        Tree tree1 = new Tree(1);
        tree1.getRoot().left = new Tree.Node(2);
        tree1.getRoot().left.left = new Tree.Node(2);
//        tree1.getRoot().left.left.right = new Tree.Node(2);
        tree1.getRoot().right = new Tree.Node(3);
        System.out.println(tree.checkIdentical(tree.getRoot(), tree1.getRoot()));
        System.out.println(tree.getSize(tree.getRoot()));
        tree.inOder(tree.getRoot());
        System.out.println();
        tree.preOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());
        System.out.println();
        tree.levelOrder(tree.getRoot());
    }
}
