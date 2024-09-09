package DataStructure.Trees;

public class BinaryTree {

    private Node root;

    private static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    public void populate() {
        root = new Node(12);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.right = new Node(18);
    }







    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();


    }
}
