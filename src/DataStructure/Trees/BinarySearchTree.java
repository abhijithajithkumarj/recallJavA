package DataStructure.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private  int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) return new Node(value);

        if (value < node.value)
            node.left = insert(node.left, value);

        else if (value > node.value)
            node.right = insert(node.right, value);

        return node;
    }



    public void preorder(){
        preorder(root);


    }

    private  void  preorder(Node root){
        if (root==null) return;

        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }


    public void postOrder(){
        postOrder(root);

    }

    private void  postOrder(Node node){
        if (node==null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }


    public  void printInOrder(){
        printInOrder(root);

    }


    private void printInOrder(Node root){
        if (root== null) return;
        printInOrder(root.left);
        System.out.println(root.value);
        printInOrder(root.right);


    }

    public  void bsfTraversal(){
        if (root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node currentNode = queue.poll();

            System.out.println(currentNode.value);

            if (currentNode.left!=null) queue.add(currentNode.left);
            if (currentNode.right!=null) queue.add(currentNode.right);
        }


    }


    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {

            if (node.left == null) return node.right;
            if (node.right == null) return node.left;


            node.value = findMin(node.right);
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    private int findMin(Node node) {
        return node.left == null ? node.value : findMin(node.left);
    }


    public static void main(String[] args) {
        BinarySearchTree bct=new BinarySearchTree();
        bct.insert(55);
        bct.insert(45);
        bct.insert(9);
        bct.insert(32);
        bct.insert(955);
        bct.insert(5);
        bct.insert(3);
        bct.preorder();

        System.out.println("_____________________________");
        bct.printInOrder();

        System.out.println("_____________________________");


        bct.postOrder();






    }
}
